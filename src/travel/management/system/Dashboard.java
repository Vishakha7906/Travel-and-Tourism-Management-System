package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Dashboard extends JFrame implements ActionListener {
    String username;
    JButton addPersonalDetails,viewPersonalDetails,updatePersonalDetails,checkpackages,bookpackage,viewpackage,viewhotels;
    JButton destinations, bookhotel,viewBookedHotel;
    Dashboard(String username){
        this.username = username;
      setBounds(0,0,1600,1000);
      setExtendedState(JFrame.MAXIMIZED_BOTH);
      setLayout(null);
      
      JPanel p1 = new JPanel ();
      p1.setLayout(null);
      p1.setBackground(new Color(0,0,102));
      p1.setBounds(0,0,1600,65);
      add(p1);
              
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
       Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel image = new JLabel(i3);
       image.setBounds(5,0,70,70);
       p1.add(image);
       
       JLabel heading = new JLabel ("Dashboard");
       heading.setBounds(80,10,300,30);
       heading.setForeground(Color.WHITE);
       heading.setFont(new Font ("Tahoma", Font.BOLD,30));
       p1.add(heading);
      
      JPanel p2 = new JPanel ();
      p2.setLayout(null);
      p2.setBackground(new Color(0,0,102));
      p2.setBounds(0,65,300,900);
      add(p2);
      
      addPersonalDetails = new JButton ("Add Personal Details");
      addPersonalDetails.setBounds(0,0,300,40);
      addPersonalDetails.setBackground(new Color(0,0,102));
      addPersonalDetails.setForeground(Color.white);
      addPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,18));
      addPersonalDetails.setMargin(new Insets(00,0,0,60));
      p2. add(addPersonalDetails);
      
     
      updatePersonalDetails = new JButton ("Update Personal Details");
      updatePersonalDetails.setBounds(0,50,300,40);
      updatePersonalDetails.setBackground(new Color(0,0,102));
      updatePersonalDetails.setForeground(Color.white);
      updatePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,18));
      updatePersonalDetails.setMargin(new Insets(00,0,0,30));
      p2. add(updatePersonalDetails);
     
     
      viewPersonalDetails = new JButton ("View Details");
      viewPersonalDetails.setBounds(0,100,300,40);
      viewPersonalDetails.setBackground(new Color(0,0,102));
      viewPersonalDetails.setForeground(Color.white);
      viewPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,18));
      viewPersonalDetails.setMargin(new Insets(00,0,0,130));
      viewPersonalDetails.addActionListener(this);
      p2. add(viewPersonalDetails);
     
      JButton deletePersonalDetails = new JButton ("Delete Personal Details");
      deletePersonalDetails.setBounds(0,150,300,40);
      deletePersonalDetails.setBackground(new Color(0,0,102));
      deletePersonalDetails.setForeground(Color.white);
      deletePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,18));
      deletePersonalDetails.setMargin(new Insets(00,0,0,40));
      p2. add(deletePersonalDetails);
     
      checkpackages = new JButton ("Check Package");
      checkpackages.setBounds(0,200,300,40);
      checkpackages.setBackground(new Color(0,0,102));
      checkpackages.setForeground(Color.white);
      checkpackages.setFont(new Font("Tahoma",Font.PLAIN,18));
      checkpackages.setMargin(new Insets(00,0,0,110));
      checkpackages.addActionListener(this);
      p2. add(checkpackages);
      
      bookpackage = new JButton ("Book Package");
      bookpackage.setBounds(0,250,300,40);
      bookpackage.setBackground(new Color(0,0,102));
      bookpackage.setForeground(Color.white);
      bookpackage.setFont(new Font("Tahoma",Font.PLAIN,18));
      bookpackage.setMargin(new Insets(00,0,0,120));
      bookpackage.addActionListener(this);
      p2. add(bookpackage);
      
      viewpackage = new JButton ("View Package");
      viewpackage.setBounds(0,300,300,40);
      viewpackage.setBackground(new Color(0,0,102));
      viewpackage.setForeground(Color.white);
      viewpackage.setFont(new Font("Tahoma",Font.PLAIN,18));
      viewpackage.setMargin(new Insets(00,0,0,120));
      viewpackage.addActionListener(this);
      p2. add(viewpackage);
      
      viewhotels = new JButton ("View Hotels");
      viewhotels.setBounds(0,350,300,40);
      viewhotels.setBackground(new Color(0,0,102));
      viewhotels.setForeground(Color.white);
      viewhotels.setFont(new Font("Tahoma",Font.PLAIN,18));
      viewhotels.setMargin(new Insets(00,0,0,130));
      viewhotels.addActionListener(this);
      p2. add(viewhotels);
      
      
      bookhotel = new JButton ("Book Hotel");
      bookhotel.setBounds(0,400,300,40);
      bookhotel.setBackground(new Color(0,0,102));
      bookhotel.setForeground(Color.white);
      bookhotel.setFont(new Font("Tahoma",Font.PLAIN,18));
      bookhotel.setMargin(new Insets(00,0,0,140));
      bookhotel.addActionListener(this);
      p2. add(bookhotel);
      
      viewBookedHotel = new JButton ("View Booked Hotel");
      viewBookedHotel.setBounds(0,450,300,40);
      viewBookedHotel.setBackground(new Color(0,0,102));
      viewBookedHotel.setForeground(Color.white);
      viewBookedHotel.setFont(new Font("Tahoma",Font.PLAIN,18));
      viewBookedHotel.setMargin(new Insets(00,0,0,70));
      viewBookedHotel.addActionListener(this);
      p2. add(viewBookedHotel);
      
      destinations = new JButton ("Destinations");
      destinations.setBounds(0,500,300,40);
      destinations.setBackground(new Color(0,0,102));
      destinations.setForeground(Color.white);
      destinations.setFont(new Font("Tahoma",Font.PLAIN,18));
      destinations.setMargin(new Insets(00,0,0,125));
      destinations.addActionListener(this);
      p2. add(destinations);

      
      JButton payments = new JButton ("Payments");
      payments.setBounds(0,550,300,40);
      payments.setBackground(new Color(0,0,102));
      payments.setForeground(Color.white);
      payments.setFont(new Font("Tahoma",Font.PLAIN,18));
      payments.setMargin(new Insets(00,0,0,155));
      p2. add(payments);

      
      JButton calculators = new JButton ("Calculator");
      calculators.setBounds(0,600,300,40);
      calculators.setBackground(new Color(0,0,102));
      calculators.setForeground(Color.white);
      calculators.setFont(new Font("Tahoma",Font.PLAIN,18));
      calculators.setMargin(new Insets(00,0,0,145));
      p2. add(calculators);
      
      
      JButton notepad = new JButton ("Notepad");
      notepad.setBounds(0,650,300,40);
      notepad.setBackground(new Color(0,0,102));
      notepad.setForeground(Color.white);
      notepad.setFont(new Font("Tahoma",Font.PLAIN,18));
      notepad.setMargin(new Insets(00,0,0,155));
      p2. add(notepad);
      
      JButton about = new JButton ("About");
      about.setBounds(0,700,300,40);
      about.setBackground(new Color(0,0,102));
      about.setForeground(Color.white);
      about.setFont(new Font("Tahoma",Font.PLAIN,18));
      about.setMargin(new Insets(0,0,0,175));
      p2. add(about);
      
       ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
       Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
       ImageIcon i6 = new ImageIcon(i5);
       JLabel img = new JLabel(i6);
       img.setBounds(0,0,1650,1000);
       add(img);
       
       JLabel text = new JLabel("Travel and Tourism Management System");
       text.setBounds(400,70,1200,70);
       text.setForeground(Color.white);
       text.setFont(new Font("Raleway",Font.PLAIN,55));
       img.add(text);      
      
  
      setVisible(true);
    }
     
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== addPersonalDetails){
            new AddCustomer(username);
            
        }else if (ae.getSource()== viewPersonalDetails){
            new ViewCustomer(username);
        }else if (ae.getSource() == updatePersonalDetails){
            new UpdateCustomer(username);
        }else if (ae.getSource() == checkpackages){
            new CheckPackage();
        }else if (ae.getSource()== bookpackage) {
            new BookPackage(username);
            
        } else if (ae.getSource() == viewpackage){
            new ViewPackage(username);
        } else if (ae.getSource() == viewhotels){
            new CheckHotels();
        } else if (ae.getSource()== destinations){
            new Destinations();
        }else if (ae.getSource()== bookhotel){
            new BookHotel(username);
        }else if (ae.getSource()== viewBookedHotel){
            new ViewBookedHotel(username);
        }
    }
    
    public static void main(String []args){
        new Dashboard("");
    }
}
