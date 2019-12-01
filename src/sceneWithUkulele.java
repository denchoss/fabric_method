public class sceneWithUkulele extends scene{
    @Override
    public guitar createGuitar(){
        return new ukulele();
    }
}