COMPANY-PG PROGRAM:

 

import java.util.*;

class company_pg

{

    ArrayList<employee> emp=new ArrayList<employee>();

    ArrayList<product> pro=new ArrayList<product>();

    ArrayList<sales> sal=new ArrayList<sales>();

    double salary;

    double proExpense;

    double sale;

 

    public void addemployee(int eid,double sal)

    {

        employee e=new employee(eid,sal);

        emp.add(e);

        salary+=sal;

    }

 

    public void addproduct(int pid,double price,int count)

    {

        product p=new product(pid,price,count);

        pro.add(p);

        proExpense+=(count*price);

    }

 

    public  void addsales(long salescount,double salesproductprice)

    {

        sales s=new sales(salescount,salesproductprice);

        sal.add(s);

        sale+=(salescount*salesproductprice);

    }

 

    public String PL()

    {

        if((sale)<(salary+proExpense))

        {

            return "loss";

        }

        else if((sale)>(salary+proExpense))

        {

            return "profit";

        }

        else

            return "neither profit nor loss";

    }

}

 



 

    public void textValueChanged(TextEvent e)

    {

 

    }

}

 
