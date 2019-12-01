public class sceneWithElectroGuitar extends scene{
    @Override
    public guitar createGuitar(){
        return new electroGuitar();
    }
}
