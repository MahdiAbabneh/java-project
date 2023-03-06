package com.company;

import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nameTable = null;
        int age;
        String usn;
        String name;
        int marks;
        Connection con=null;
        Statement statement=null;
        ResultSet resultSet=null;
        boolean flag=true;
        Scanner sc=new Scanner(System.in);

        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\user1\\Desktop\\mahdii.db");
            if (con != null) {
                System.out.println("Connection OK");
            }
        } catch (Exception PSQLException) {
            System.out.println(PSQLException.getMessage());
        }

        do
        {
            System.out.println("Press 0 to CREATE Table ");
            System.out.println("Press 1 to INSERT into Table ");
            System.out.println("Press 2 to DELETE from Table ");
            System.out.println("Press 3 to UPDATE into Table ");
            System.out.println("Press 4 to VIEW ALL from Table ");
            System.out.println("Press 5 to EXIT");
            System.out.println("Enter your choice");
            int choice=Integer.parseInt(sc.nextLine());

            switch(choice)
            {
                case 0:
                    try {
                        System.out.println("insert your name table ");
                        nameTable= sc.nextLine();
                        statement=con.createStatement();
                        statement.execute("CREATE TABLE "+nameTable+" (usn String, name String , marks int , age int)");
                        System.out.println("Table created with name "+ nameTable);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;

                case 1:

                    System.out.println(" enter usn");
                    usn=sc.nextLine();
                    System.out.println(" enter name");
                    name=sc.nextLine();
                    System.out.println(" enter marks");
                    marks=sc.nextInt();
                    System.out.println(" enter age");
                    age=sc.nextInt();
                    try
                    {
                        String query="Insert into stud values('"+usn+"','"+name+"','"+marks+"','"+age+"' )";
                        statement=con.createStatement();
                        statement.execute(query);
                        System.out.println("row inserted");
                    }

                    catch(Exception e)
                    {
                        System.out.println("error2"+e);

                    }
                    break;

                case 2:

                    try
                    {
                        System.out.println("Eneter the usn");
                        String str2=sc.nextLine();
                        //String query="delete from stud where usn=str2";
                        statement=con.createStatement();
                        int x=statement.executeUpdate("delete from stud where usn="+"'"+str2+"'");
                        System.out.println("deleted rows are:"+x);

                    }
                    catch(Exception e)
                    {
                        System.out.println("error3"+e);

                    }
                    break;

                case 3:

                    try
                    {
                        System.out.println("enter usn to be updated");
                        String usn1=sc.nextLine();
                        String query="update stud set marks=90 where usn='"+usn1+"'";
                        statement=con.createStatement();
                        int x=statement.executeUpdate(query);
                        System.out.println("updated rows are:"+x);

                    }
                    catch(Exception e)
                    {
                        System.out.println("error"+e);

                    }
                    break;

                case 4:

                    try
                    {

                        String query="select * from stud ";
                        statement=con.createStatement();
                        resultSet=statement.executeQuery(query);
                        boolean rec=resultSet.next();
                        while(!rec)

                        {
                            System.out.println("no record");
                        }

                        do
                        {
                            usn=resultSet.getString(1);
                            name=resultSet.getString(2);
                            marks=resultSet.getInt(3);
                            System.out.print(usn+"\t");
                            System.out.print(name+"\t");
                            System.out.println(marks);

                        }while(resultSet.next());

                        statement.close();
                        con.close();

                    }

                    catch(Exception e)
                    {
                        System.out.println("error5"+e);

                    }
                    break;
                case 5:
                    System.exit(1);
                    break;

                default:
                    System.out.println("wrong input");

            }
            System.out.println("do u want to continue(yes /no)");
            String str=sc.nextLine();
            if(str.equals("yes")|| str.equals("y"))
                flag=true;
            if(str.equals("no")||str.equals("n"))
                flag=false;

        }while(flag);
    }
    }

