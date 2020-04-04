
void setup() {
  size(700,700);
PImage face = loadImage("https://cdn4.vectorstock.com/i/1000x1000/40/83/cartoon-character-face-boy-children-vector-14814083.jpg");

face.resize(700,700);
image (face,0,0);
}
void draw() {
  if(mousePressed == true){
   fill(mouseX,111,mouseY);
   ellipse(230,380,100,55);
   fill(mouseY,111,mouseX);
   ellipse(475,380,100,55);
  }
}
