import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class DrawingPattern{

	int num;

	public static void main(String[] args) {
		DrawingPattern d = new DrawingPattern();
	}

	public DrawingPattern(){

		Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number of rows or column (2<= n >=50) : ");
			num = sc.nextInt();
		JFrame frame = new JFrame("Floor Tile Design");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new MyComponent());
		frame.setSize(400,400);
		frame.setVisible(true);	 
	}

	public class MyComponent extends JComponent{
		public void paint(Graphics g){

			

			 int height = 20, width = 20;
			 int x=0, y=0;


			 if(num >=2 && num <=50)
			 {
				for(int i=0; i<num; i++)
			{	
				if(i%2==0)
				{
					x=x+20;
					y=0;
					
					for(int j=0; j<num; j++)
					{
						if(j%2 == 0)
						{
							g.setColor(Color.black);
							g.drawOval(x,y,height,width);
							y=y+20;
						
						}
						else
						{
							
							g.setColor(Color.red);
							g.fillRect(x,y,height,width);
							y = y + 20;
						}

					}		

				}
				
				else
				{
					x=x+20;
					y=0;
					for(int j=0; j<num; j++)
					{
						if(j%2 == 0)
						{

							g.setColor(Color.red);
							g.fillRect(x,y,height,width);
							y= y+20;
						}
						else
						{
							g.setColor(Color.black);
							g.drawOval(x,y,height,width);
							y=y+20;
						}
					}		
				}
			}

			}
			else
			{
				System.out.print("Wrong input");
			}
			
			
		
		}
	}
}
