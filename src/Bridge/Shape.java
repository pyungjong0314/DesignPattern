package Bridge;

abstract class Shape {
    protected DrawingApi drawingApi;
    protected Shape(DrawingApi drawingApi) {
        this.drawingApi = drawingApi;
    }
    public abstract void draw();
    public abstract void resizeByPercentage(double pct);
}

class circle extends Shape{
    private double x, y, radius;

    public circle(double x, double y, double radius, DrawingApi drawingApi) {
        super(drawingApi);
        this.x = x; this.y = y; this.radius = radius;
    }

        public void draw() {
        drawingApi.drawCircle(x, y, radius);
    }

    public void resizeByPercentage(double pct) {
        radius *= pct;
    }
}