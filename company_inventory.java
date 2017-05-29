COMPANY_INVENTORY PROGRAM:

 

import java.awt.*;

import java.applet.*;

import java.awt.event.*;

public class company_inventory extends Applet implements ActionListener

{

    company_pg cp=new company_pg();

    TextField emp,pro,sal,pold;

    Button pol,e,p,s;

    public void init()

    {

        GridLayout gl=new GridLayout(4,3);

        setLayout(gl);

 

        Label n=new Label("Employee:",Label.CENTER);

        Label pr=new Label("Product:",Label.CENTER);

        Label sa=new Label("Sales:",Label.CENTER);

        emp=new TextField(20);

        pro=new TextField(20);

        sal=new TextField(20);

        pold=new TextField(20);

        pol=new Button("profit or loss");

        e=new Button("add employee");

        p=new Button("add product");

        s=new Button("add sales");

 

        add(n);

        add(emp);

        add(e);

 

        add(pr);

        add(pro);

        add(p);

 

        add(sa);

        add(sal);

        add(s);

 

        add(pol);

        add(pold);

 

        e.addActionListener(this);

        p.addActionListener(this);

        s.addActionListener(this);

        pol.addActionListener(this);       

 

    }

 

    public void actionPerformed(ActionEvent ae)

    {

        String str=ae.getActionCommand();

        if(str.equals("add employee"))

        {

            String y[]=emp.getText().split(" ");

            int eid=Integer.parseInt(y[0]);

            double esal=Double.parseDouble(y[1]);

            cp.addemployee(eid,esal);

            emp.setText("");

        }

        else if(str.equals("add product"))

        {

            String y[]=pro.getText().split(" ");

            int pid=Integer.parseInt(y[0]);

            double price=Double.parseDouble(y[1]);

            int count=Integer.parseInt(y[2]);

            cp.addproduct(pid,price,count);

            pro.setText("");

        }

        else if(str.equals("add sales"))

        {

            String y[]=sal.getText().split(" ");

            int count=Integer.parseInt(y[0]);

            double price=Double.parseDouble(y[1]);          

            cp.addsales(count,price);

            sal.setText("");

        }

        else if(str.equals("profit or loss"))

        {

            pold.setText(cp.PL());

        }

    }
