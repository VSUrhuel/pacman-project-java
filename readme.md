# Pacman
**Problem by: Sir Jomari Joseph Barera - Instructor at VSU**

**Coded by: John Rhuel Laurente - BS in Computer Science**

**Coverage: Creating Classes and Inheritance**

**Introduction**
In most game development platforms, when rendering 2D game objects they used the cartesian plane as shown below:

![Cartesian Plane](https://ibb.co/qCQssdR)

From the origin, the value increases as you go rightward and downward, otherwise it decreases (leftward/upward).

Rectangles represents most of 2D game objects since most images are rendered in that shape. Rectangles are represented by the location, width, and height attributes as shown on the image below. The location is the reference point where the rectangle is anchored on and the width and the height corresponds to the area covered by that rectangle from the location reference point. That encompasses the area covered by a Rectangle object.

![Rectangle Dimension Sample](https://ibb.co/jRmjY4B)

Therefore, given a reference point (3,7) as the location, the width (10), and the height (6), the point value of B is (13,7), C is (3,13), and D is (13,13).

![Contains Demo Diagram](https://ibb.co/Ptj2dsQ)

The image above demonstrates that a Point object is contained in the rectangle if the location of the point is in the area/bounds of the rectangle. Point U and W is contained in the rectangle while Point V is not.


![1st Two Rectangles Sample](https://ibb.co/9q6x2b1)
![2nd Two Rectangles Sample](https://ibb.co/1Q5sXVc)
![3rd Two Rectangles Sample](https://ibb.co/WGsX8Vq)


The image above demonstrates rectangles can collide or not with other rectangles. In the series of images, Ra does not collide with Rb, Rc does not collide with Rd, and Re collides with Rf. Observe the values of the location, width, and height attributes and come up with an accurate condition for when does a rectangle collide with another rectangle using the attributes outlined.

![Pacman UML Diagram](https://ibb.co/K0xYZyb)
### Rectangle Class
Implement the **Rectangle** class, given the UML diagram above with the following constraints:
1. Implement the *attributes, constructors, accessors,* and *mutators* as shown in the UML class diagram.
2. For the *first constructor*, initialize the **location** attribuate with the **x** and **y** paramter values and the **width** and **height** attribute for their equivalent parameter values. If the width and height attribute for their equivalent parameter vaues. If the **width/height** values are less than 0, set it to 0 since there are no realistic negative values for those attributes.
3. For the *copy constructor*, just replicate the values for all attributes. Make sure that the **location** attribute should be instantiated as another **Point** object based from the values of the parameter, **r**.
4. For the **getLocation** *accessoor*, return only a copy objetc of the **location** attribute. For the **getWidth** and **getHeight** accessors, just return the values of their assigned attributes.
5. For the **setLocation** *mutator*, just assign the **x** and **y** attributes of the **location** attribute with the parameter values. For the **setWidth** and **setHeight** *mutators*, only assign the value if the parameter value is *greater than* or *equal* to *0*, otherwise don't bother updating the value of the equivalent attribute.
6. For the **contains** method, return *true* if the poitn is inside the area of the rectangle as explained in the introductaion, otherwise return *false*.
7. For the **collidesWith** method, return *true* if the **rectangle** parameter intersects the current rectangle object (*this*) as explained in the introduction, otherwise return false.
8. Override also the **toString** method using the code snippet below:


	@Override
	public String toString()
	{
		return "(" + this.location.x + ", " + this.location.y +") w: " + this.width + " h: " + this.height;
	}

### Pacman Class
Given the UML with relationships above, implement the **Pacman** class, with the following constraints:

1. Implement the *attributes* as shown in the UML class diagram.
2. For the *constructor*, initialize the **dimension** attribute with the parameters **x, y**, **width**, and **height**, appropriately. Initialize also the **stride** attribute with the equivalent parameter value and the **totalScore** attribute to 0.
3. For the **getDimension** *accessor*, return only a copy object of the **dimension** attribute while the for the **getTotalScore** *accessor*, just return the value of the equivalent attribute.
4. For the **eat** method, if the pellet is *visible* and the bounds of the pellet collides with the **Pacman** object, the **Pacman** object can eat the pellet by adding the pellet's *score* to the *total score* of the **Pacman** object and set the visibility of the pellet to *false*. If the eating of the pellet has been executed, return *true*, otherwise, return *false*.
5. For the methods **moveUp, moveDown, moveLeft,** and **moveRight**, update the **location** attribute of the **dimension** attribute to increase its **x** or **y** value with the value of its **stride**. For example if the **dimension** attribute has a location of (0,0) and a stride of 5, then if **moveUp** is called, the **location** will move upward with a value of the stride therefore, the updated location should be (0, -5). Refer to the cartesian coordinate system of 2D game objects in most game development platforms below:

![Cartesian Plane](https://ibb.co/qCQssdR)
6. Override also the **toString** method using the code snippet below:


	@Override

	public String toString()
	{
		return "Pacman (Total Score: " + this.totalScore + ") " + this.dimension;
	}

### Pellet Class
Given the UML with relationships above, implement the **Pellet** class, with the following constraints:

1. Implement the *attributes* as shown in the UML class diagram.
2. For the *constructor*, initialize the **dimension** attribute with the parameters **x, y, width,** and **height**, appropriately. Initialize also the **score** attribute with the equivalent parameter value and the **isVisible** attribute to *true*.
3. For the **getDimension** accessor, return only a copy object of the **dimension** attribute.
4. Override also the **toString** method using the code snippet below:


	@Override
	public String toString()
	{
		return "Pellet " + this.dimension;
	}

### Point Class
Given the UML with relationships above, implement the **Point** class, with the following constraints:

1. Implement the *attributes* and *constructors* as shown in the UML class diagram.
2. For the default *constructor*, initialize the **x** and **y** values to be both 0. For the **copy constructor**, just replicate the values for both attributes. For the last *constructor*, just initialize the *attributes* based on the equivalent parameter values.
3. Override also the **toString** method using the code snippet below:


	@Override


	public String toString()
	{
		return "(" + this.x + ", " + this.y ")";
	}

**This is one of the problem on Midterm Laboratory Exam on JAVA OOP**
**July 2023**
