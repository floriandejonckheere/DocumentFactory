/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domein;

/**
 *
 * @author florian
 */
public class DrawingApplication extends Application {

    @Override
    protected Document createDocument() {
        return new DrawingDocument();
    }
}
