package Characters.BotTanks;

import javax.swing.ImageIcon;

import Characters.Speed;
import Characters.getImage.getBotImage;

public class NormalBot extends Bot {

    public NormalBot(int x, int y) {
        super(x, y);
        setImg();
        setSize();
        setSpeed();
        setFireRate();
        setHp();
    }

    @Override
    public void setHp(){
        setHp(1);
    }

    @Override
    public void setImg() {
        // TODO Auto-generated method stub
        // ImageIcon ii = new ImageIcon("TANK/src/resource/EnemyTank.png");
        // setImg(ii.getImage());
        setImg(getBotImage.getImg());
    }

    @Override
    public void setSize() {
        // TODO Auto-generated method stub
        setW(getImg().getWidth(null));
        setH(getImg().getHeight(null));
    }

    @Override
    public void setSpeed() {
        // TODO Auto-generated method stub
        setSpeed(Speed.NORMAL);
    }

    @Override
    public void setFireRate() {
        // TODO Auto-generated method stub
        setFireRate(6);
    }
    
}
