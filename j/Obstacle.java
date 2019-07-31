class Obstacle{
    int x, y, width, height;
    
    Obstacle(int x, int y, int width, int height){
      this.x = x;
      this.y = y;
      this.width = width;
      this.height = height;
     
    }
   
    
    void draw(){
      //draw obstacle(s)
      fill(0, 0, 255);
      rect(x, y, width, height);
    }
    
    
  }
  