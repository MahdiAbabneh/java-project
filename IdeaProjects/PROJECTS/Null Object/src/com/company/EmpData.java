package com.company;

public class EmpData {

    public static final String[] names = {"Lokesh", "Kushagra", "Vikram"};

    public static Emp getClient(String name)
    {
        for (int i = 0; i < names.length; i++)
        {
            if (names[i].equalsIgnoreCase(name))
            {
                return new Coder(name);
            }
        }
        return new NoClient();
    }
}
