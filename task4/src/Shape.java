public class Shape
{
    protected final String id;
    protected final int dimension;
    protected Renderer renderer;

    public Shape(String id, int dimension, Renderer renderer)
    {
        this.id = id;
        this.dimension = dimension;
        this.renderer = renderer;
    }

    public void setImplementation(Renderer renderer)
    {
        this.renderer = renderer;
    }

    public String getId()
    {
        return id;
    }

    public int getDimension()
    {
        return dimension;
    }

    public abstract String execute();





}
