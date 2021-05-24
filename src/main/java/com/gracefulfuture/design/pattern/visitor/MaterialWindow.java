package com.gracefulfuture.design.pattern.visitor;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
* @description      材料窗体类
* @author           chenkun
* @create           2021/5/24 10:31
* @version          1.0
*/
class MaterialWindow extends JFrame implements ItemListener {
    private static final long serialVersionUID = 1L;
    JPanel centerJP;
    MaterialSet ms;    //材料集对象
    Company visitor1, visitor2;    //访问者对象
    String[] select;
    MaterialWindow() {
        super("利用访问者模式设计艺术公司和造币公司");
        JRadioButton Art;
        JRadioButton mint;
        ms = new MaterialSet();
        ms.add(new Cuprum());
        ms.add(new Paper());
        visitor1 = new ArtCompany();//艺术公司
        visitor2 = new MintCompany(); //造币公司
        this.setBounds(10, 10, 750, 350);
        this.setResizable(false);
        centerJP = new JPanel();
        this.add("Center", centerJP);
        JPanel southJP = new JPanel();
        JLabel yl = new JLabel("原材料有：铜和纸，请选择生产公司：");
        Art = new JRadioButton("艺术公司", true);
        mint = new JRadioButton("造币公司");
        Art.addItemListener(this);
        mint.addItemListener(this);
        ButtonGroup group = new ButtonGroup();
        group.add(Art);
        group.add(mint);
        southJP.add(yl);
        southJP.add(Art);
        southJP.add(mint);
        this.add("South", southJP);
        select = (ms.accept(visitor1)).split(" ");    //获取产品名
        showPicture(select[0], select[1]);    //显示产品
    }
    //显示图片
    void showPicture(String cuprum, String paper) {
        centerJP.removeAll();    //清除面板内容
        centerJP.repaint();    //刷新屏幕
        String fileName1 = "src/main/java/com/gracefulfuture/design/pattern/visitor/" + cuprum + ".jpg";
        String fileName2 = "src/main/java/com/gracefulfuture/design/pattern/visitor/" + paper + ".jpg";
        JLabel lb = new JLabel(new ImageIcon(fileName1), JLabel.CENTER);
        JLabel rb = new JLabel(new ImageIcon(fileName2), JLabel.CENTER);
//        JLabel lb = new JLabel("qwqww", JLabel.CENTER);
//        JLabel rb = new JLabel("12231", JLabel.CENTER);
        centerJP.add(lb);
        centerJP.add(rb);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    @Override
    public void itemStateChanged(ItemEvent arg0) {
        JRadioButton jc = (JRadioButton) arg0.getSource();
        if (jc.isSelected()) {
            if (jc.getText() == "造币公司") {
                select = (ms.accept(visitor2)).split(" ");
            } else {
                select = (ms.accept(visitor1)).split(" ");
            }
            showPicture(select[0], select[1]);    //显示选择的产品
        }
    }
}
