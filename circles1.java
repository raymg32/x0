//// Wild circles #1.

// GLOBAL VARIABLES //
float x,y;

// Setup:  screen size, initialization. //
void setup() {
  size(897, 789);        // Try changing the width & height.
  x=  width/2;
  y=  height/2;
}

// Next frame:  draw three circles. //
void draw() {
  fill(0,0,67);
  stroke(255);
  ellipse(400, y , 390, 390);
  fill(0,150,0);
  ellipse(300, 300, 100, 79);
  ellipse(469, 300, 100, 79);
  ellipse(400,500,40,40 );
  
  rect(350,400, 100,50);
  ellipse(200,300,50,50);
  //color the ear
  fill(255,0,0);
  ellipse(600,300,50,50);
 
  // Move them???? //--
  x=  x + 2;  y=  y + 1;
  // Insert BREAK here ^
  // to uncomment the above code,
  //name charlie
String name = "CHARLIE";

  text ( name, 379,430);

}
