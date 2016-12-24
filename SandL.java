import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class SandL extends Canvas implements ActionListener
{
	SandL sandl;
	JPanel p1,p2;
	Dialog dialog;
	JFrame f;
	static JButton b,b1,b2,B[]=new JButton[100];
	static ImageIcon i1,i2,i3,i4,i5,I[]=new ImageIcon[100],YI[]=new ImageIcon[100],GI[]=new ImageIcon[100],BI[]=new ImageIcon[100],RI[]=new ImageIcon[100];
	JLabel l1,l2;
	JMenu File,Help;
	JMenuItem New,Exit,About;
	JMenuBar m;
	JRadioButton r1,r2,r3,r4;
	JTextField tf1,tf2,tf3,tf4;
	String str[]=new String[4];
	int numberofplr=0;
	SandL()
	{
	}
	SandL(String S)
	{
		for(int i=0;i<100;i++)
		{
			String sd1="images\\"+Integer.toString(i+1)+".gif";
			I[i]=new ImageIcon(sd1);
			String sd2="y_images\\y"+Integer.toString(i+1)+".gif";
			YI[i]=new ImageIcon(sd2);
			String sd3="g_images\\g"+Integer.toString(i+1)+".gif";
			GI[i]=new ImageIcon(sd3);
			String sd4="b_images\\b"+Integer.toString(i+1)+".gif";
			BI[i]=new ImageIcon(sd4);
			String sd5="r_images\\r"+Integer.toString(i+1)+".gif";
			RI[i]=new ImageIcon(sd5);
		}
		i1=new ImageIcon("images\\SandL.gif");
		i2=new ImageIcon("images\\101.gif");
		i3=new ImageIcon("images\\102.gif");
		i4=new ImageIcon("images\\103.gif");
		i5=new ImageIcon("images\\104.gif");
		f=new JFrame(S);
		p1=new JPanel();
		p1.setBackground(Color.YELLOW);
		p2=new JPanel();
		p2.setBackground(Color.GREEN);
		int a=99,bb=0;
		for(int i=99;i>=0;i--)
		{
			if(bb==0)
			{
				B[a]=new JButton();
				p2.add(B[a]);
				B[a].setBackground(Color.GREEN);
				B[a].setIcon(I[a]);
				a--;
				if(a==89||a==69||a==49||a==29||a==9)	{bb=1; a-=9;}
			}
			else
			{
				B[a]=new JButton();
				p2.add(B[a]);
				B[a].setBackground(Color.GREEN);
				B[a].setIcon(I[a]);
				a++;
				if(a==90||a==70||a==50||a==30||a==10)	{a-=11; bb=0;}
			}
		}
		l1=new JLabel("SELECT THE NUMBER OF PLAYERS");
		l1.setFont(new Font("Serif", Font.PLAIN, 38));
		l2=new JLabel("ENTER THE NAMES OF THE PLAYERS");
		l2.setFont(new Font("Serif", Font.PLAIN, 38));
		p1.add(l1);
		File=new JMenu("File");
		Help=new JMenu("Help");
		About=new JMenuItem("About");
		New =new JMenuItem("New");
		Exit=new JMenuItem("Exit");
		m=new JMenuBar();
		File.add(New);
		File.addSeparator();
		File.add(Exit);
		m.add(File);
		Help.add(About);
		m.add(Help);
		f.setJMenuBar(m);
		New.addActionListener(this);
		Exit.addActionListener(this);
		About.addActionListener(this);
		b=new JButton("START & PLAY");
		b.setBounds(255,490,190,35);
		f.add(b);
		b.addActionListener(this);
		b.setBackground(Color.YELLOW);
		b.setForeground(Color.RED);
		b1=new JButton();
		b1.setPreferredSize(new Dimension(250,250));
		f.add(this);
		r1=new JRadioButton("Player 1",false);
		r2=new JRadioButton("Player 2",true);
		r3=new JRadioButton("Player 3",false);
		r4=new JRadioButton("Player 4",false);
		ButtonGroup bg= new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		r1.setFont(new Font("Serif", Font.PLAIN,35));
		r2.setFont(new Font("Serif", Font.PLAIN,35));
		r3.setFont(new Font("Serif", Font.PLAIN,35));
		r4.setFont(new Font("Serif", Font.PLAIN,35));
		r1.setBackground(Color.YELLOW);
		r2.setBackground(Color.YELLOW);
		r3.setBackground(Color.YELLOW);
		r4.setBackground(Color.YELLOW);
		r1.setForeground(Color.RED);
		r2.setForeground(Color.RED);
		r3.setForeground(Color.RED);
		r4.setForeground(Color.RED);
		p1.add(r1);
		p1.add(r2);
		p1.add(r3);
		p1.add(r4);
		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
		r4.addActionListener(this);
		p1.add(b1);
		p1.add(l2);
		tf1=new JTextField("Player 1");
		tf2=new JTextField("Player 2");
		tf3=new JTextField("Player 3");
		tf4=new JTextField("Player 4");
		tf1.setPreferredSize(new Dimension(140,60));
		tf2.setPreferredSize(new Dimension(140,60));
		tf3.setPreferredSize(new Dimension(140,60));
		tf4.setPreferredSize(new Dimension(140,60));
		p1.add(tf1);
		p1.add(tf2);
		p1.add(tf3);
		p1.add(tf4);
		b2=new JButton("START");
		b2.setPreferredSize(new Dimension(600,150));
		b2.setFont(new Font("Serif", Font.PLAIN,35));
		b2.setBackground(Color.YELLOW);
		b2.setForeground(Color.RED);
		b2.addActionListener(this);
		p1.add(b2);
		p2.setLayout(new GridLayout(10,10));
		f.setSize(720,720);
		f.setVisible(true);
		f.setLocation(310,10);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void paint(Graphics g)
	{
		setBackground(Color.YELLOW);
		setForeground(Color.RED);
		g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
		g.drawString("SNAKES AND LADDERS",75,100);
		i1.paintIcon(this,g,200,140);
		g.drawString("PRABHAV GARG",160,600);
	}
	/*public void repaint(Graphics g)
	{
		setBackground(Color.GREEN);
	        g.drawLine(0, 0, 100, 100);
	}*/
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Exit"))
		{
			System.exit(0);
		}
		if(e.getActionCommand().equals("About"))
		{
			new Developer();
		}
		if(e.getSource()==b)
		{
			f.setContentPane(p1);
			f.validate();
			f.repaint();
		}
		if(r1.isSelected())
		{
			numberofplr=1;
			b1.setIcon(i2);
			tf1.setVisible(true);
			tf2.setVisible(false);
			tf3.setVisible(false);
			tf4.setVisible(false);
		}
		else if(r2.isSelected())
		{
			numberofplr=2;
			b1.setIcon(i3);
			tf1.setVisible(true);
			tf2.setVisible(true);
			tf3.setVisible(false);
			tf4.setVisible(false);
		}
		else if(r3.isSelected())
		{
			numberofplr=3;
			b1.setIcon(i4);
			tf1.setVisible(true);
			tf2.setVisible(true);
			tf3.setVisible(true);
			tf4.setVisible(false);
		}
		else if(r4.isSelected())
		{
			numberofplr=4;
			b1.setIcon(i5);
			tf1.setVisible(true);
			tf2.setVisible(true);
			tf3.setVisible(true);
			tf4.setVisible(true);
		}
		str[0]=tf1.getText();
		str[1]=tf2.getText();
		str[2]=tf3.getText();
		str[3]=tf4.getText();
		if(e.getSource()==b2)
		{
			f.remove(p1);
			f.setContentPane(p2);
			f.validate();
			f.repaint();
			dialog=new Dialog(numberofplr,str,sandl);
		}
		if(e.getActionCommand().equals("New"))
		{
			f.setVisible(false);
			SandL sandl=new SandL("Snakes and Ladders");
			try{dialog.close();}catch(Exception eg){}
		}
	}
	public static void main(String[] args)
	{
		SandL sandl=new SandL("Snakes And Ladders");
	}
	public static void change(int aaa[],int bbb[],int ccc[],int ddd[])
	{
		for(int j=0;j<100;j++)
		{
			B[j].setIcon(I[j]);
		}
		System.out.println("Haaaaaaaaaaaaaaaaa");
		for(int j=0;j<4;j++)
		{
			if(aaa[j]!=0&&aaa[j]<101)	B[aaa[j]-1].setIcon(BI[aaa[j]-1]);
		}
		for(int j=0;j<4;j++)
		{
			if(bbb[j]!=0&&bbb[j]<101)	B[bbb[j]-1].setIcon(YI[bbb[j]-1]);
		}
		for(int j=0;j<4;j++)
		{
			if(ccc[j]!=0&&ccc[j]<101)	B[ccc[j]-1].setIcon(GI[ccc[j]-1]);
		}
		for(int j=0;j<4;j++)
		{
			if(ddd[j]!=0&&ddd[j]<101)	B[ddd[j]-1].setIcon(RI[ddd[j]-1]);
		}
		System.out.println(aaa[0]+" "+aaa[1]+" "+aaa[2]+" "+aaa[3]+" "+bbb[0]+" "+bbb[1]+" "+bbb[2]+" "+bbb[3]+" "+ccc[0]+" "+ccc[1]+" "+ccc[2]+" "+ccc[3]+" "+ddd[0]+" "+ddd[1]+" "+ddd[2]+" "+ddd[3]);
	}
}
class Dialog extends JFrame implements ActionListener
{
	int n=0,play=0,running=0,A[]=new int[4],BBB[]=new int[4],C[]=new int[4],D[]=new int[4],bata=0,number=0,j=0,number1=0;
	ImageIcon I[]=new ImageIcon[6];
	SandL obj;
	char ch[]=new char[102];
	String name[]=new String[4];
	JFrame f1,f2,f3,f4;
	JPanel p1,p2,p3,p4,p5,p6,p7,p8;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JButton B[]=new JButton[16],BB[]=new JButton[4];
	Dialog(int a,String s[],SandL object)
	{
		obj=object;
		for(int i=0;i<6;i++)
		{
			String st1="images\\d"+Integer.toString(i+1)+".gif";
			I[i]=new ImageIcon(st1);
		}
		for(int k=0;k<4;k++)
		name[k]=s[k];
		n=a;
		play=n;
		f1=new JFrame(s[0]);
		f2=new JFrame(s[1]);
		f3=new JFrame(s[2]);
		f4=new JFrame(s[3]);
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		p4=new JPanel();
		p5=new JPanel();
		p6=new JPanel();
		p7=new JPanel();
		p8=new JPanel();
		l1=new JLabel(s[0]);
		l2=new JLabel(s[1]);
		l3=new JLabel(s[2]);
		l4=new JLabel(s[3]);
		l5=new JLabel(s[0]+" Loss..!!");
		l6=new JLabel(s[1]+" Loss..!!");
		l7=new JLabel(s[2]+" Loss..!!");
		l8=new JLabel(s[3]+" Loss..!!");
		p5.add(l5);
		p6.add(l6);
		p7.add(l7);
		p8.add(l8);
		l1.setFont(new Font("Arial",Font.PLAIN,20));
		l2.setFont(new Font("Arial",Font.PLAIN,20));
		l3.setFont(new Font("Arial",Font.PLAIN,20));
		l4.setFont(new Font("Arial",Font.PLAIN,20));
		l5.setFont(new Font("Arial",Font.PLAIN,20));
		l6.setFont(new Font("Arial",Font.PLAIN,20));
		l7.setFont(new Font("Arial",Font.PLAIN,20));
		l8.setFont(new Font("Arial",Font.PLAIN,20));
		f1.add(p1);
		f2.add(p2);
		f3.add(p3);
		f4.add(p4);
		p1.setBackground(Color.GRAY);
		p2.setBackground(Color.GRAY);
		p3.setBackground(Color.GRAY);
		p4.setBackground(Color.GRAY);
		p5.setBackground(Color.GRAY);
		p6.setBackground(Color.GRAY);
		p7.setBackground(Color.GRAY);
		p8.setBackground(Color.GRAY);
		p1.setLayout(new FlowLayout(FlowLayout.CENTER));
		p2.setLayout(new FlowLayout(FlowLayout.CENTER));
		p3.setLayout(new FlowLayout(FlowLayout.CENTER));
		p4.setLayout(new FlowLayout(FlowLayout.CENTER));
		p5.setLayout(new FlowLayout(FlowLayout.CENTER));
		p6.setLayout(new FlowLayout(FlowLayout.CENTER));
		p7.setLayout(new FlowLayout(FlowLayout.CENTER));
		p8.setLayout(new FlowLayout(FlowLayout.CENTER));
		for(int i=0;i<4;i++)
		{
			BB[i]=new JButton();
			BB[i].setPreferredSize(new Dimension(270,140));
			BB[i].setBackground(Color.BLACK);
			BB[i].setIcon(I[5]);
			BB[i].addActionListener(this);
		}
		for(int i=0;i<16;i++)
		{
			B[i]=new JButton("0");
			B[i].setPreferredSize(new Dimension(130,40));
			B[i].setFont(new Font("Arial",Font.PLAIN,30));
			B[i].addActionListener(this);
			if(i>=12)	{p4.add(B[i]); B[i].setBackground(Color.RED);}
			else if(i>=8)	{p3.add(B[i]); B[i].setBackground(Color.GREEN);}
			else if(i>=4)	{p2.add(B[i]); B[i].setBackground(Color.YELLOW);}
			else if(i>=0)	{p1.add(B[i]); B[i].setBackground(Color.BLUE);}
		}
		l1.setForeground(Color.BLUE);
		p1.add(BB[0]);
		p2.add(BB[1]);
		p3.add(BB[2]);
		p4.add(BB[3]);
		p1.add(l1);
		p2.add(l2);
		p3.add(l3);
		p4.add(l4);
		if(n==1)
		{
			f1.setVisible(true);
			f2.setVisible(false);
			f3.setVisible(false);
			f4.setVisible(false);
		}
		else if(n==2)
		{
			f1.setVisible(true);
			f2.setVisible(true);
			f3.setVisible(false);
			f4.setVisible(false);
		}
		else if(n==3)
		{
			f1.setVisible(true);
			f2.setVisible(true);
			f3.setVisible(true);
			f4.setVisible(false);
		}
		else
		{
			f1.setVisible(true);
			f2.setVisible(true);
			f3.setVisible(true);
			f4.setVisible(true);
		}
		f1.setSize(300,320);
		f2.setSize(300,320);
		f3.setSize(300,320);
		f4.setSize(300,320);
		f1.setLocation(15,10);
		f2.setLocation(1025,10);
		f3.setLocation(15,410);
		f4.setLocation(1025,410);
	}
	public void close()
	{
		f1.setVisible(false);
		f2.setVisible(false);
		f3.setVisible(false);
		f4.setVisible(false);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(running==0)
		{
			if(e.getSource()==BB[0])
			{
				int a=-1;
				double ddd=Math.random();
				a=(int)(ddd*6);
				BB[0].setIcon(I[a]);
				bata=1;	number1=a+1; number+=number1;
				if(a==5&&j<3) {running--; j++;}
				if(j==3)number=0;
				running++;
				running=running%n;
				if(n>1&&running==1) {l2.setForeground(Color.YELLOW);l1.setForeground(Color.BLACK);j=0;}
				if(n==1&&a!=5) {l1.setForeground(Color.BLUE);j=0;}
			}
		}
		else if(running==1)
		{
			if(e.getSource()==BB[1])
			{
				int a=-1;
				double ddd=Math.random();
				a=(int)(ddd*6);
				BB[1].setIcon(I[a]);
				bata=2;	number1=a+1; number+=number1;
				if(a==5&&j<3) {running--; j++;}
				if(j==3)number=0;
				running++;
				running=running%n;
				if(n>2&&running==2) {l3.setForeground(Color.GREEN);l2.setForeground(Color.BLACK);j=0;}
				if(n==2&&a!=5) {l1.setForeground(Color.YELLOW);l2.setForeground(Color.BLACK);j=0;}
			}
		}
		else if(running==2)
		{
			if(e.getSource()==BB[2])
			{
				int a=-1;
				double ddd=Math.random();
				a=(int)(ddd*6);
				BB[2].setIcon(I[a]);
				bata=3;	number1=a+1; number+=number1;
				if(a==5&&j<3) {running--; j++;}
				if(j==3)number=0;
				running++;
				running=running%n;
				if(n>3&&running==3) {l4.setForeground(Color.RED);l3.setForeground(Color.BLACK);j=0;}
				if(n==3&&a!=5) {l1.setForeground(Color.YELLOW);l3.setForeground(Color.BLACK);j=0;}
			}
		}
		else if(running==3)
		{
			if(e.getSource()==BB[3])
			{
				int a=-1;
				double ddd=Math.random();
				a=(int)(ddd*6);
				BB[3].setIcon(I[a]);
				bata=4;	number1=a+1; number+=number1;
				if(a==5&&j<3) {running--; j++;}
				if(j==3)number=0;
				running++;
				running=running%n;
				if(running==0&&a!=5) {l1.setForeground(Color.BLUE);l4.setForeground(Color.BLACK);j=0;}
			}
		}
		switch(bata)
		{
			case 1:{
				if(e.getSource()==B[0])		{A[0]+=number;
								switch(A[0])
								{
									case 4:	A[0]+=21;
									break;
									case 13:	A[0]+=33;
									break;
									case 33:	A[0]+=16;
									break;
									case 42:	A[0]+=21;
									break;
									case 50:	A[0]+=19;
									break;
									case 62:	A[0]+=19;
									break;
									case 74:	A[0]+=18;
									break;
									case 27:	A[0]-=22;
									break;
									case 40:	A[0]-=37;
									break;
									case 43:	A[0]-=25;
									break;
									case 54:	A[0]-=23;
									break;
									case 66:	A[0]-=19;
									break;
									case 76:	A[0]-=18;
									break;
									case 89:	A[0]-=36;
									break;
									case 99:	A[0]-=58;
								}
								if(A[0]>101)	A[0]-=number;number=0;
								}
				if(e.getSource()==B[1])		{A[1]+=number;
								switch(A[1])
								{
									case 4:	A[1]+=21;
									break;
									case 13:	A[1]+=33;
									break;
									case 33:	A[1]+=16;
									break;
									case 42:	A[1]+=21;
									break;
									case 50:	A[1]+=19;
									break;
									case 62:	A[1]+=19;
									break;
									case 74:	A[1]+=18;
									break;
									case 27:	A[1]-=22;
									break;
									case 40:	A[1]-=37;
									break;
									case 43:	A[1]-=25;
									break;
									case 54:	A[1]-=23;
									break;
									case 66:	A[1]-=19;
									break;
									case 76:	A[1]-=18;
									break;
									case 89:	A[1]-=36;
									break;
									case 99:	A[1]-=58;
								}
								if(A[1]>101)	A[1]-=number;number=0;
								}
				if(e.getSource()==B[2])		{A[2]+=number;
								switch(A[2])
								{
									case 4:	A[2]+=21;
									break;
									case 13:	A[2]+=33;
									break;
									case 33:	A[2]+=16;
									break;
									case 42:	A[2]+=21;
									break;
									case 50:	A[2]+=19;
									break;
									case 62:	A[2]+=19;
									break;
									case 74:	A[2]+=18;
									break;
									case 27:	A[2]-=22;
									break;
									case 40:	A[2]-=37;
									break;
									case 43:	A[2]-=25;
									break;
									case 54:	A[2]-=23;
									break;
									case 66:	A[2]-=19;
									break;
									case 76:	A[2]-=18;
									break;
									case 89:	A[2]-=36;
									break;
									case 99:	A[2]-=58;
								}
								if(A[2]>101)	A[2]-=number;number=0;
								}
				if(e.getSource()==B[3])		{A[3]+=number;
								switch(A[3])
								{
									case 4:	A[3]+=21;
									break;
									case 13:	A[3]+=33;
									break;
									case 33:	A[3]+=16;
									break;
									case 42:	A[3]+=21;
									break;
									case 50:	A[3]+=19;
									break;
									case 62:	A[3]+=19;
									break;
									case 74:	A[3]+=18;
									break;
									case 27:	A[3]-=22;
									break;
									case 40:	A[3]-=37;
									break;
									case 43:	A[3]-=25;
									break;
									case 54:	A[3]-=23;
									break;
									case 66:	A[3]-=19;
									break;
									case 76:	A[3]-=18;
									break;
									case 89:	A[3]-=36;
									break;
									case 99:	A[3]-=58;
								}
								if(A[3]>101)	A[3]-=number;number=0;
								}
				}
			break;
			case 2:{
				if(e.getSource()==B[4])		{BBB[0]+=number;
								switch(BBB[0])
								{
									case 4:	BBB[0]+=21;
									break;
									case 13:	BBB[0]+=33;
									break;
									case 33:	BBB[0]+=16;
									break;
									case 42:	BBB[0]+=21;
									break;
									case 50:	BBB[0]+=19;
									break;
									case 62:	BBB[0]+=19;
									break;
									case 74:	BBB[0]+=18;
									break;
									case 27:	BBB[0]-=22;
									break;
									case 40:	BBB[0]-=37;
									break;
									case 43:	BBB[0]-=25;
									break;
									case 54:	BBB[0]-=23;
									break;
									case 66:	BBB[0]-=19;
									break;
									case 76:	BBB[0]-=18;
									break;
									case 89:	BBB[0]-=36;
									break;
									case 99:	BBB[0]-=58;
								}
								if(BBB[0]>101)	BBB[0]-=number;number=0;
								}
				if(e.getSource()==B[5])		{BBB[1]+=number;
								switch(BBB[1])
								{
									case 4:	BBB[1]+=21;
									break;
									case 13:	BBB[1]+=33;
									break;
									case 33:	BBB[1]+=16;
									break;
									case 42:	BBB[1]+=21;
									break;
									case 50:	BBB[1]+=19;
									break;
									case 62:	BBB[1]+=19;
									break;
									case 74:	BBB[1]+=18;
									break;
									case 27:	BBB[1]-=22;
									break;
									case 40:	BBB[1]-=37;
									break;
									case 43:	BBB[1]-=25;
									break;
									case 54:	BBB[1]-=23;
									break;
									case 66:	BBB[1]-=19;
									break;
									case 76:	BBB[1]-=18;
									break;
									case 89:	BBB[1]-=36;
									break;
									case 99:	BBB[1]-=58;
								}
								if(BBB[1]>101)	BBB[1]-=number;number=0;
								}
				if(e.getSource()==B[6])		{BBB[2]+=number;
								switch(BBB[2])
								{
									case 4:	BBB[2]+=21;
									break;
									case 13:	BBB[2]+=33;
									break;
									case 33:	BBB[2]+=16;
									break;
									case 42:	BBB[2]+=21;
									break;
									case 50:	BBB[2]+=19;
									break;
									case 62:	BBB[2]+=19;
									break;
									case 74:	BBB[2]+=18;
									break;
									case 27:	BBB[2]-=22;
									break;
									case 40:	BBB[2]-=37;
									break;
									case 43:	BBB[2]-=25;
									break;
									case 54:	BBB[2]-=23;
									break;
									case 66:	BBB[2]-=19;
									break;
									case 76:	BBB[2]-=18;
									break;
									case 89:	BBB[2]-=36;
									break;
									case 99:	BBB[2]-=58;
								}
								if(BBB[2]>101)	BBB[2]-=number;number=0;
								}
				if(e.getSource()==B[7])		{BBB[3]+=number;
								switch(BBB[3])
								{
									case 4:	BBB[3]+=21;
									break;
									case 13:	BBB[3]+=33;
									break;
									case 33:	BBB[3]+=16;
									break;
									case 42:	BBB[3]+=21;
									break;
									case 50:	BBB[3]+=19;
									break;
									case 62:	BBB[3]+=19;
									break;
									case 74:	BBB[3]+=18;
									break;
									case 27:	BBB[3]-=22;
									break;
									case 40:	BBB[3]-=37;
									break;
									case 43:	BBB[3]-=25;
									break;
									case 54:	BBB[3]-=23;
									break;
									case 66:	BBB[3]-=19;
									break;
									case 76:	BBB[3]-=18;
									break;
									case 89:	BBB[3]-=36;
									break;
									case 99:	BBB[3]-=58;
								}
								if(BBB[3]>101)	BBB[3]-=number;number=0;
								}
				}
			break;
			case 3:{
				if(e.getSource()==B[8])		{C[0]+=number;
								switch(C[0])
								{
									case 4:	C[0]+=21;
									break;
									case 13:	C[0]+=33;
									break;
									case 33:	C[0]+=16;
									break;
									case 42:	C[0]+=21;
									break;
									case 50:	C[0]+=19;
									break;
									case 62:	C[0]+=19;
									break;
									case 74:	C[0]+=18;
									break;
									case 27:	C[0]-=22;
									break;
									case 40:	C[0]-=37;
									break;
									case 43:	C[0]-=25;
									break;
									case 54:	C[0]-=23;
									break;
									case 66:	C[0]-=19;
									break;
									case 76:	C[0]-=18;
									break;
									case 89:	C[0]-=36;
									break;
									case 99:	C[0]-=58;
								}
								if(C[0]>101)	C[0]-=number;number=0;
								}
				if(e.getSource()==B[9])		{C[1]+=number;
								switch(C[1])
								{
									case 4:	C[1]+=21;
									break;
									case 13:	C[1]+=33;
									break;
									case 33:	C[1]+=16;
									break;
									case 42:	C[1]+=21;
									break;
									case 50:	C[1]+=19;
									break;
									case 62:	C[1]+=19;
									break;
									case 74:	C[1]+=18;
									break;
									case 27:	C[1]-=22;
									break;
									case 40:	C[1]-=37;
									break;
									case 43:	C[1]-=25;
									break;
									case 54:	C[1]-=23;
									break;
									case 66:	C[1]-=19;
									break;
									case 76:	C[1]-=18;
									break;
									case 89:	C[1]-=36;
									break;
									case 99:	C[1]-=58;
								}
								if(C[1]>101)	C[1]-=number;number=0;
								}
				if(e.getSource()==B[10])	{C[2]+=number;
								switch(C[2])
								{
									case 4:	C[2]+=21;
									break;
									case 13:	C[2]+=33;
									break;
									case 33:	C[2]+=16;
									break;
									case 42:	C[2]+=21;
									break;
									case 50:	C[2]+=19;
									break;
									case 62:	C[2]+=19;
									break;
									case 74:	C[2]+=18;
									break;
									case 27:	C[2]-=22;
									break;
									case 40:	C[2]-=37;
									break;
									case 43:	C[2]-=25;
									break;
									case 54:	C[2]-=23;
									break;
									case 66:	C[2]-=19;
									break;
									case 76:	C[2]-=18;
									break;
									case 89:	C[2]-=36;
									break;
									case 99:	C[2]-=58;
								}
								if(C[2]>101)	C[2]-=number;number=0;
								}
				if(e.getSource()==B[11])	{C[3]+=number;
								switch(C[3])
								{
									case 4:	C[3]+=21;
									break;
									case 13:	C[3]+=33;
									break;
									case 33:	C[3]+=16;
									break;
									case 42:	C[3]+=21;
									break;
									case 50:	C[3]+=19;
									break;
									case 62:	C[3]+=19;
									break;
									case 74:	C[3]+=18;
									break;
									case 27:	C[3]-=22;
									break;
									case 40:	C[3]-=37;
									break;
									case 43:	C[3]-=25;
									break;
									case 54:	C[3]-=23;
									break;
									case 66:	C[3]-=19;
									break;
									case 76:	C[3]-=18;
									break;
									case 89:	C[3]-=36;
									break;
									case 99:	C[3]-=58;
								}
								if(C[3]>101)	C[3]-=number;number=0;
								}
				}
			break;
			case 4:{
				if(e.getSource()==B[12])	{D[0]+=number;
								switch(D[0])
								{
									case 4:	D[0]+=21;
									break;
									case 13:	D[0]+=33;
									break;
									case 33:	D[0]+=16;
									break;
									case 42:	D[0]+=21;
									break;
									case 50:	D[0]+=19;
									break;
									case 62:	D[0]+=19;
									break;
									case 74:	D[0]+=18;
									break;
									case 27:	D[0]-=22;
									break;
									case 40:	D[0]-=37;
									break;
									case 43:	D[0]-=25;
									break;
									case 54:	D[0]-=23;
									break;
									case 66:	D[0]-=19;
									break;
									case 76:	D[0]-=18;
									break;
									case 89:	D[0]-=36;
									break;
									case 99:	D[0]-=58;
								}
								if(D[0]>101)	D[0]-=number;number=0;
								}
				if(e.getSource()==B[13])	{D[1]+=number;
								switch(D[1])
								{
									case 4:	D[1]+=21;
									break;
									case 13:	D[1]+=33;
									break;
									case 33:	D[1]+=16;
									break;
									case 42:	D[1]+=21;
									break;
									case 50:	D[1]+=19;
									break;
									case 62:	D[1]+=19;
									break;
									case 74:	D[1]+=18;
									break;
									case 27:	D[1]-=22;
									break;
									case 40:	D[1]-=37;
									break;
									case 43:	D[1]-=25;
									break;
									case 54:	D[1]-=23;
									break;
									case 66:	D[1]-=19;
									break;
									case 76:	D[1]-=18;
									break;
									case 89:	D[1]-=36;
									break;
									case 99:	D[1]-=58;
								}
								if(D[1]>101)	D[1]-=number;number=0;
								}
				if(e.getSource()==B[14])	{D[2]+=number;
								switch(D[2])
								{
									case 4:	D[2]+=21;
									break;
									case 13:	D[2]+=33;
									break;
									case 33:	D[2]+=16;
									break;
									case 42:	D[2]+=21;
									break;
									case 50:	D[2]+=19;
									break;
									case 62:	D[2]+=19;
									break;
									case 74:	D[2]+=18;
									break;
									case 27:	D[2]-=22;
									break;
									case 40:	D[2]-=37;
									break;
									case 43:	D[2]-=25;
									break;
									case 54:	D[2]-=23;
									break;
									case 66:	D[2]-=19;
									break;
									case 76:	D[2]-=18;
									break;
									case 89:	D[2]-=36;
									break;
									case 99:	D[2]-=58;
								}
								if(D[2]>101)	D[2]-=number;number=0;
								}
				if(e.getSource()==B[15])	{D[3]+=number;
								switch(D[3])
								{
									case 4:	D[3]+=21;
									break;
									case 13:	D[3]+=33;
									break;
									case 33:	D[3]+=16;
									break;
									case 42:	D[3]+=21;
									break;
									case 50:	D[3]+=19;
									break;
									case 62:	D[3]+=19;
									break;
									case 74:	D[3]+=18;
									break;
									case 27:	D[3]-=22;
									break;
									case 40:	D[3]-=37;
									break;
									case 43:	D[3]-=25;
									break;
									case 54:	D[3]-=23;
									break;
									case 66:	D[3]-=19;
									break;
									case 76:	D[3]-=18;
									break;
									case 89:	D[3]-=36;
									break;
									case 99:	D[3]-=58;
								}
								if(D[3]>101)	D[3]-=number;number=0;
								}
				}
		}
		for(int k=0;k<4;k++)
		{
			if(ch[A[k]]!='a'&&A[k]!=101)
			{
				for(int n=0;n<4;n++)
				{
					if(BBB[n]==A[k])	BBB[n]=0;
					if(C[n]==A[k])	C[n]=0;
					if(D[n]==A[k])	D[n]=0;
				}
			}
			ch[A[k]]='a';
			B[k].setText(Integer.toString(A[k]));
		}
		for(int k=0;k<4;k++)
		{
			if(ch[BBB[k]]!='b'&&BBB[k]!=101)
			{
				for(int n=0;n<4;n++)
				{
					if(A[n]==BBB[k])	A[n]=0;
					if(C[n]==BBB[k])	C[n]=0;
					if(D[n]==BBB[k])	D[n]=0;
				}
			}
			ch[BBB[k]]='b';
			B[k+4].setText(Integer.toString(BBB[k]));
		}
		for(int k=0;k<4;k++)
		{
			if(ch[C[k]]!='c'&&C[k]!=101)
			{
				for(int n=0;n<4;n++)
				{
					if(A[n]==C[k])		A[n]=0;
					if(BBB[n]==C[k])	BBB[n]=0;
					if(D[n]==C[k])		D[n]=0;
				}
			}
			ch[C[k]]='c';
			B[k+8].setText(Integer.toString(C[k]));
		}
		for(int k=0;k<4;k++)
		{
			if(ch[D[k]]!='d'&&D[k]!=101)
			{
				for(int n=0;n<4;n++)
				{
					if(A[n]==D[k])	A[n]=0;
					if(BBB[n]==D[k])	BBB[n]=0;
					if(C[n]==D[k])	C[n]=0;
				}
			}
			ch[D[k]]='d';
			B[k+12].setText(Integer.toString(D[k]));
		}
		

		for(int k=0;k<4;k++)
		{
			B[k].setText(Integer.toString(A[k]));
		}
		for(int k=0;k<4;k++)
		{
			B[k+4].setText(Integer.toString(BBB[k]));
		}
		for(int k=0;k<4;k++)
		{
			B[k+8].setText(Integer.toString(C[k]));
		}
		for(int k=0;k<4;k++)
		{
			B[k+12].setText(Integer.toString(D[k]));
		}
		SandL.change(A,BBB,C,D);
		if(A[0]+A[1]+A[2]+A[3]==404)	{f1.remove(p1);f1.setContentPane(p5);f1.validate();f1.repaint();l5.setText(name[0]+" Won..!!");
						 f2.remove(p2);f2.setContentPane(p6);f2.validate();f2.repaint();
						 f3.remove(p3);f3.setContentPane(p7);f3.validate();f3.repaint();
						 f4.remove(p4);f4.setContentPane(p8);f4.validate();f4.repaint();
						}
		if(BBB[0]+BBB[1]+BBB[2]+BBB[3]==404)	{f1.remove(p1);f1.setContentPane(p5);f1.validate();f1.repaint();l6.setText(name[1]+" Won..!!");
						 f2.remove(p2);f2.setContentPane(p6);f2.validate();f2.repaint();
						 f3.remove(p3);f3.setContentPane(p7);f3.validate();f3.repaint();
						 f4.remove(p4);f4.setContentPane(p8);f4.validate();f4.repaint();
						}
		if(C[0]+C[1]+C[2]+C[3]==404)	{f1.remove(p1);f1.setContentPane(p5);f1.validate();f1.repaint();l7.setText(name[2]+" Won..!!");
						 f2.remove(p2);f2.setContentPane(p6);f2.validate();f2.repaint();
						 f3.remove(p3);f3.setContentPane(p7);f3.validate();f3.repaint();
						 f4.remove(p4);f4.setContentPane(p8);f4.validate();f4.repaint();
						}
		if(D[0]+D[1]+D[2]+D[3]==404)	{f1.remove(p1);f1.setContentPane(p5);f1.validate();f1.repaint();l8.setText(name[3]+" Won..!!");
						 f2.remove(p2);f2.setContentPane(p6);f2.validate();f2.repaint();
						 f3.remove(p3);f3.setContentPane(p7);f3.validate();f3.repaint();
						 f4.remove(p4);f4.setContentPane(p8);f4.validate();f4.repaint();
						}
		for(int n=0;n<16;n++)
		{
			if(B[n].getText()=="101")
			B[n].setVisible(false);
		}
		System.out.println(B[0].getText());
		System.out.println(number);
	}
}
class Developer extends Canvas implements ActionListener
{
	JFrame f;
	JButton b;
	JLabel l;
	JPanel p;
	Developer()
	{
		f=new JFrame("About");
		p=new JPanel();
		l=new JLabel("Developer of Game:: Prabhav Garg");
		l.setBounds(25,20,380,50);
		l.setForeground(Color.RED);
		l.setFont(new Font("Arial",Font.PLAIN,20));
		b=new JButton("OK");
		b.setFont(new Font("Arial",Font.PLAIN,17));
		b.setBounds(150,90,80,35);
		b.setPreferredSize(new Dimension(140,60));
		b.setBackground(Color.YELLOW);
		b.setForeground(Color.RED);
		b.addActionListener(this);
		p.setBackground(Color.YELLOW);
		p.add(l);
		p.add(b);
		f.setContentPane(p);
		f.setSize(400,200);
		f.setLayout(null);
		f.setLocation(470,255);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
		{
			f.setVisible(false);
		}
	}
}