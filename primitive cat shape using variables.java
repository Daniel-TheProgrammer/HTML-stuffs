float catX;
float catY;
float cateyeR;
float cateyeG;
float cateyeB;
void setup() {
size(200, 200);
catX = width/2; // cat at the center
zoogY = height + 100; // cat should be below the screen
}
void draw() {
background(255);
// Set ellipses and rects to CENTER mode
ellipseMode(CENTER);
rectMode(CENTER);
// Draw cat's body
stroke(0);
fill(150);
rect(catX, catY, 20, 100);
// Draw cat's head
stroke(0);
fill(255);
ellipse(zoogX, zoogY-30, 60, 60);
// Draw Zoog's eyes
eyeR = random(255);
eyeG = random(255);
eyeB = random(255);
fill(eyeR, eyeG, eyeB);
ellipse(zoogX-19, zoogY-30, 16, 32);
ellipse(zoogX+19, zoogY-30, 16, 32);
// Draw cat's legs
stroke(150);
line(catX-10, catY+50, catX-10, height);
line(catX+10, catY+50, catX+10, height);
// Zoog moves up
catY = catY - 1;

//Using Conditional statement to show that if the fill color becomes negative it should reset to 255
if (mouseX > width/2) {
r = r + 1;
} else {
r = r - 1;
}
if (r > 255) {
r = 255;//if the fill color becomes negative it should reset to 255
} else if (r < 0) {
r = 0;
}
}