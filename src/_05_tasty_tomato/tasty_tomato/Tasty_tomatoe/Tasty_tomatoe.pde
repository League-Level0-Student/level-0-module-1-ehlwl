void setup() {
    size(500, 500);
}
void draw() {
    background(200, 200, 200);
    noStroke();
    fill(256,0,0);
    ellipse(150, 200, 150, 150);
    fill(256,0,0);
    ellipse(212, 200, 150, 150);
    fill(0,256,0);
    rect(176, 103, 12, 32);
    if(mousePressed == true){
      fill(200,200,200);
      ellipse(75,200,100,100);
    }
}
