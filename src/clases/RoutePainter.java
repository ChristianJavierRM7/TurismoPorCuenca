/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.awt.*;
import java.awt.geom.*;
import java.util.List;
import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.painter.Painter;
import org.jxmapviewer.viewer.GeoPosition;

/**
 *
 * @author emili
 */
public class RoutePainter implements Painter<JXMapViewer> {

    private final List<GeoPosition> track;

    public RoutePainter(List<GeoPosition> track) {
        this.track = track;
    }

    @Override
    public void paint(Graphics2D g, JXMapViewer map, int w, int h) {
        g = (Graphics2D) g.create();
        g.setColor(Color.RED);
        g.setStroke(new BasicStroke(2));

        Point2D prev = null;
        for (GeoPosition gp : track) {
            Point2D pt = map.getTileFactory().geoToPixel(gp, map.getZoom());
            if (prev != null) {
                g.draw(new Line2D.Double(prev, pt));
            }
            prev = pt;
        }
        g.dispose();
    }
}
