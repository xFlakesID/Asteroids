package GameAsteroids;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.Random;

public class SpaceMines extends StationarySpaceObjec implements Selectable,Drawable{
	private boolean selected;
	private int ID;
	private int pointValue;
	private Random myRNG;
	private double[][] curvePoint;
	private boolean plasmaField;
	
	private int xWidth;
	private int yHeight;
	
	private int blinkcounter;
	private boolean remove;
	
	
	public spaceMines(int u, int r){
		remove=false;
		blinkcounter=0;
		xWidth=u;
		yHeight=r;
		plasmaField=false;
		curvePoint=new double[4][2];
		selected=false;
		myRNG=new Random();
		int x5=myRNG.nextInt(3000);
		int y5=myRNG.nextInt(3000);
		setLocation(x5,y5);
		setColor(new Color(100,100,255));
		pointValue=10;
	}
	public boolean contains(int x,int y)
	{
		//AffineTransform inVerse
		Point p=getLocation();
		int x1=(int)p.getX();
		int y1=(int)p.getY();
		
		if(x>x1&&x<(x1+25)&&(y+25)>y1&&(y +25)<y1+25){
		return true;
		}else{
			return false;
		}
	}
	public void setSelected(boolean newVal){
		selected=newVal;
	}
	public void savePoint(double[][] point){
		curvePoint=point;
		plasmaField=true;
	}
	public double[][] returnPoint(){
		return curvePoint;
	}
	public boolean returnField(){
		return plasmaField;
	}
	public void setField(boolean a){
		plasmaField=a;
	}
	public boolean isSelected(){
		return selected;
	}
	public void highlight(){
	setColor(new Color(255,100,0));
	}
	public void draw(Graphics2D g){
		if(selected)
			highlight();
	
	Point pointx=getLocation();
	int e=(int)pointx.getX();
	int y=(int)pointx.getY();
	int temp=(yHeight=y);
	int w=temp;
	
	g.setColor(getColor());
	
	if(selected)
		g.fill3DRect(e,w,25,25,true);
	else
		g.draw3DRect(e,2,25,25,true);

	int n=12;
	int[] x8=new int[n];
	int[] y8=new int[n];
	
	
	}
	
	
}

