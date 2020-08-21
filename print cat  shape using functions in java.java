// Declare all global variables (stays the same)
int x = 0;
int speed = 1;
// Setup does not change
void setup() {
size(200, 200);
}
Public Class Cat{
int position;
String eye_color;
String ear_color;
String body_color;
boolean isVisible=false;

Cat(int pos,String eye,String ear,String body){
this.position=pos;
this.eye_color=eye;
this.ear_color=ear;
this.body_color=body;
}
void draw() {
background(255);
move();
bounce();
display();
}
// A function to move the cat
void move() {
// Change the speed of cat as it moves around
x = x + speed;
}
// A function to bounce the cat
void bounce() {
// If it reaches the wall, it bounces off
if ((x > width) || (x < 0)) {
speed = speed * -1;
}
}
// A function to display the cat
void display() {
stroke(0);
fill(175);
ellipse(x, 100, 32, 32);