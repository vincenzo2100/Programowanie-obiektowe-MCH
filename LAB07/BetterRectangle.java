import java.awt.Rectangle;
class BetterRectangle extends  Rectangle
{
    int x;
    int y;
    int dl;
    int szer;

    public BetterRectangle(int x,int y, int dl, int szer)
    {
        this.x = x;
        this.y = y;
        this.dl = dl;
        this.szer = szer;

       setLocation(x,y);
       setSize(dl,szer);
    }

    public int getPerimeter()
    {
        int perimeter = 2*(this.dl+this.szer);
        return  perimeter;
    }

    public int GetArea()
    {
        int area = this.dl*this.szer;
        return area;
    }
}
