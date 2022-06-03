import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class DrawingColor{
	public static void main(String[] args) {
		DrawingColor d = new DrawingColor();
	}

	public DrawingColor(){
		JFrame frame = new JFrame("Drawing colorfull shapes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new MyComponent());
		frame.setSize(400,400);
		frame.setVisible(true);	
	}

	public class MyComponent extends JComponent{
		public void paint(Graphics g)
		{
			int height = 50, width = 50;
			int x=0, y=0;

			// int num;
			// Scanner sc = new Scanner(System.in);
			// System.out.print("enter the number of row or column: ");
			// num= sc.nextInt();



			// if(num >=2 && num<50)
			
				for(int i=0; i<10; i++)
				{	
					if(i%2==0)
					{
						x=x+50;
						y=0;
						
						for(int j=0; j<10; j++)
						{
							if(j%2 == 0)
							{
								g.setColor(Color.black);
								g.drawOval(x,y,height,width);
								y=y+50;
							
							}
							else
							{
								
								g.setColor(Color.red);
								g.fillRect(x,y,height,width);
								y = y + 50;
							}
	
						}		
	
					}
					
					else
					{
						x=x+50;
						y=0;
						for(int j=0; j<10; j++)
						{
							if(j%2 == 0)
							{
	
								g.setColor(Color.red);
								g.fillRect(x,y,height,width);
								y= y+50;
							}
							else
							{
								g.setColor(Color.black);
								g.drawOval(x,y,height,width);
								y=y+50;
							}
						}		
					}
				}

			// }

			// else
			// {
			// 	System.out.print("Wrong input: ");
			// }



			
			

			
			
			
		
		}
		
			
	}
}