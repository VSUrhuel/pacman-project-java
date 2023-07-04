public class Main
{
	public static void main(String[] args) {
		Point u = new Point(12, 10.8);
		Point v = new Point(13.4, 14.3);
		Point w = new Point(9.7, 11);
		Rectangle r = new Rectangle(9, 10, 3, 8);
		System.out.println(r);
		System.out.println(r.contains(u));
		System.out.println(r.contains(v));
		System.out.println(r.contains(w));

		Rectangle Ra = new Rectangle(-4, 6, 7.5, 4);
		Rectangle Rb = new Rectangle(-4, 10, 3.8, 4.72);
		Rectangle Rc = new Rectangle(1.22, -4.5, 5.5, 2.2);
		Rectangle Rd = new Rectangle(2.91, -0.7, 1.8, 6.3);
		Rectangle Re = new Rectangle(-3.0, -5.0, 10, 5);
		Rectangle Rf = new Rectangle(-1.0, -2.3, 6.0, 7.5);
		System.out.println("");
		System.out.println(Ra.collidesWith(Rb));
		System.out.println(Rb.collidesWith(Ra));
		System.out.println(Rc.collidesWith(Rd));
		System.out.println(Rd.collidesWith(Rc));
		System.out.println(Re.collidesWith(Rf));
		System.out.println(Rf.collidesWith(Re));

		Point d = new Point(-2.4, 5.1);
		System.out.println(d);


		Pacman main = new Pacman(20.5, 15.80, 3, 3, 2.0);
		Pellet[] pellets = new Pellet[3];
		pellets[0] = new Pellet(20,11,1,1,5);
		pellets[1] = new Pellet(11.5,7.8,3,3,3);
		pellets[2] = new Pellet(14.2,12.7,0.4,0.4,8);

		System.out.println(main);
		for(Pellet p : pellets)
		    System.out.println(p + ((p.isVisible)? " can be eaten.":" is not visible."));
		System.out.println();

		for(int i=0; i < 4; i++)
		{
		    main.moveUp();
		    for(Pellet p : pellets)
		        main.eat(p);
		    System.out.println(main);
		    for(Pellet p : pellets)
		        System.out.println(p + ((p.isVisible)? " can be eaten.":" is not visible."));
		    System.out.println();
		}

		for(int i=0; i < 3; i++)
		{
		    main.moveLeft();
		    for(Pellet p : pellets)
		        main.eat(p);
		    System.out.println(main);
		    for(Pellet p : pellets)
		        System.out.println(p + ((p.isVisible)? " can be eaten.":" is not visible."));
		    System.out.println();
		}

		main.moveDown();
		for(Pellet p : pellets)
		    main.eat(p);
		System.out.println(main);
		for(Pellet p : pellets)
		    System.out.println(p + ((p.isVisible)? " can be eaten.":" is not visible."));
		System.out.println();
	}
}