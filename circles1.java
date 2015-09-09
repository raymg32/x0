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
  ellipse(400, y , 390, 390);
  ellipse(300, 300, 100, 79);
  ellipse(469, 300, 100, 79);
  ellipse(400,500,40,40 );
 
  // Move them???? //--
  x=  x + 2;  y=  y + 1;
  // Insert BREAK here ^
  // to uncomment the above code,
}
