package za.ac.cput.elecdevs.qasim;

public class DVD
{
    private int dvdId;
    private String title;
    private int length;

    public DVD(int dvdId ,String title, int length)
    {
        this.dvdId = dvdId;
        this.title = title;
        this.length = length;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public int getLength()
    {
        return length;
    }

    public void setLength(int length)
    {
        this.length = length;
    }

    public int getDvdId()
    {
        return dvdId;
    }

    public void setDvdId(int dvdId)
    {
        this.dvdId = dvdId;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DVD dvd = (DVD) o;

        return dvdId == dvd.dvdId;
    }

    @Override
    public int hashCode()
    {
        return dvdId;
    }
}
