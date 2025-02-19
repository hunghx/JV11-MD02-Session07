package ra;

public class WildCard {
    //phuwogn thwucs trả về generic
    public CRUDManager<? super StudentC2> getCRUDManager() {
        // StudentC2 -> Student -> IColorAble
        return new CRUDManager<IColorAble>();
    }
}
