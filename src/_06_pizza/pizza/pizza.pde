import ddf.minim.*;
Minim minim;
AudioPlayer sound;

void setup() {
    size(700,700);
    fill(158,138,42);
    ellipse(350,350,300,300);
    minim = new Minim(this);
    sound = minim.loadFile("ding.wav");
}
void draw() {
    PImage pep = loadImage("p.png");
    pep.resize(30,30);
    if(mousePressed && (mouseButton == LEFT)){
    image(pep,mouseX,mouseY); 
    sound.play();
    sound.rewind();
    
    }
    if(mousePressed && (mouseButton == RIGHT)){
     pep.resize(50,50);
    image(pep,mouseX,mouseY); 
    sound.play();
    sound.rewind();
}
}
