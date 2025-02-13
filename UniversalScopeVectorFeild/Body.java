import java.util.Vector;

public class Body {
    private Vector r; //position
    private Vector v; //velocity
    private final double mass; //mass

    public Body(Vector f, double dt) {
        Vector a  =  f.scale(1/mass);
        v = v.plus(a.scale(dt));
        r = r.plus(v.scale(dt));
    }

    public Vector forceForm(Body b) {
        Body a = this;
        double G = 6.67e-11;
        Vector delta = b.r.minus(a.r);
        double dist = delta.magnitude();
        double magnitude = (G * a.mass * b.mass)/ (dist * dist);
        return delta.direction().scale(magnitude);
    }

    public void draw() {
        StdDraw.setPenRadius(0.025);
        StdDraw.point(r.cartesian(0), r.cartesian(1));

    }

    //This method is only needed if you want to change the size of Vector

    public void draw(double penRadius) {
        StdDraw.setPenRadius(penRadius);
        StdDraw.point(r.cartesian(0), r.cartesian(1));
    }
    
}
