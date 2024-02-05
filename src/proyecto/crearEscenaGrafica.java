/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import com.sun.j3d.utils.behaviors.mouse.MouseRotate;
import com.sun.j3d.utils.geometry.Box;

import com.sun.j3d.utils.geometry.Cone;
import com.sun.j3d.utils.geometry.Cylinder;
import com.sun.j3d.utils.geometry.Primitive;
import com.sun.j3d.utils.geometry.Sphere;
import java.awt.Color;
import javax.media.j3d.Appearance;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.DirectionalLight;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.Color3f;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3f;


public class crearEscenaGrafica {
int paraTextura = Primitive.GENERATE_NORMALS + Primitive.GENERATE_TEXTURE_COORDS;
    TransformGroup tgGiro;
    TransformGroup tgBase;
    TransformGroup tgBisagraDer;
    TransformGroup tgBisagraIzq;
    TransformGroup tgBurosp;
    TransformGroup tgSilla;
    TransformGroup tg2Silla;
    TransformGroup tg3Silla;
    TransformGroup tg4Silla;
    TransformGroup tg5Silla;
    TransformGroup tg6Silla;
    TransformGroup tg7Silla;
    TransformGroup tg8Silla;
    TransformGroup tg9Silla;
    TransformGroup tg10Silla;
    BranchGroup objRaiz = new BranchGroup();
    int contador = 0;
    int contador2 = 0;   
     //Textura   
        Appearance defautl = new Apariencia().getTransparencia();
        Appearance puertaDer = new Apariencia().setImagen("PuertaMetal.JPG");
        Appearance puertaIzq = new Apariencia().setImagen("PuertaMetal.JPG");
        Appearance ventana = new Apariencia().setImagen("oscuro.JPG");
        Appearance muebles = new Apariencia().setImagen("madera.JPG");
        Appearance buro = new Apariencia().setImagen("buro.JPG");
        Appearance almoada = new Apariencia().setImagen("almoada.JPG");
        Appearance cobija = new Apariencia().setImagen("cobija.JPG");
        Appearance colchon = new Apariencia().setImagen("colchon.JPG");
        Appearance colchonlado = new Apariencia().setImagen("lado.JPG");
        Appearance piso = new Apariencia().setImagen("pisocuarto.JPG");
        Appearance paredResta = new Apariencia().setImagen("paredRestaurante.JPG");
        Appearance paredCuarto = new Apariencia().setImagen("paredRestaurante.JPG");
        Appearance techoResta = new Apariencia().setImagen("techorestaurante.JPG");
        Appearance techocuarto = new Apariencia().setImagen("techocuarto.JPG");
        Appearance pared = new Apariencia().setImagen("pared.JPG");
        Appearance techo = new Apariencia().setImagen("techo.JPG");
        Appearance filo = new Apariencia().setImagen("marmol.JPG");
    public crearEscenaGrafica() {
        //Figuras
        Box bxPuertaDer = new Box(0.0325f, 0.08f, 0.01f, paraTextura, puertaDer);
        Box bxPuertaIzq = new Box(0.0325f, 0.08f, 0.01f, paraTextura, puertaIzq);
        Box bxventanaPared = new Box(0.006f, 0.006f, 0.006f, paraTextura, ventana);
        Box bxcristalPared = new Box(0.006f, 0.006f, 0.001f, paraTextura, defautl);
        Box bxventanaPared2 = new Box(0.006f, 0.006f, 0.006f, paraTextura, ventana);
        Box bxcristalPared2 = new Box(0.006f, 0.006f, 0.001f, paraTextura, defautl);
        Box bxRestaurante = new Box(0.2f, 0.12f, 0.5f, paraTextura, pared);
        Box bxCuartoTecho = new Box(0.19f, 0.005f, 0.49f, paraTextura, techocuarto);
        Box bxCuartoparedDer = new Box(0.005f, 0.06f, 0.5f, paraTextura, paredCuarto);
        Box bxCuartoparedIzq = new Box(0.005f, 0.06f, 0.5f, paraTextura, paredCuarto);
        Box bxCuartoparedAdelante = new Box(0.19f, 0.06f, 0.005f, paraTextura, paredCuarto);
        Box bxCuartoparedAtras = new Box(0.19f, 0.06f, 0.005f, paraTextura, paredCuarto);
        Box bxRestauranteTecho = new Box(0.19f, 0.005f, 0.49f, paraTextura, techoResta);
        bxRestauranteTecho.setAppearance(4,piso);
        Box bxRestauranteparedDer = new Box(0.005f, 0.06f, 0.5f, paraTextura, paredResta);
        Box bxRestauranteparedIzq = new Box(0.005f, 0.06f, 0.5f, paraTextura, paredResta);
        Box bxRestauranteparedAdelante = new Box(0.19f, 0.06f, 0.005f, paraTextura, paredResta);
        Box bxRestauranteparedAtras = new Box(0.19f, 0.06f, 0.005f, paraTextura, paredResta);
        Box bxRestaurantepiso = new Box(0.19f, 0.005f, 0.49f, paraTextura, piso);
        Box bxMesa = new Box(0.095f, 0.005f, 0.2f, paraTextura, muebles);
        Box bxCama = new Box(0.15f, 0.015f, 0.12f, paraTextura, colchonlado);
        bxCama.setAppearance(4,colchon);    
        bxCama.setAppearance(5,ventana);
        Box bxCobija = new Box(0.121f, 0.0075f, 0.121f, paraTextura, cobija);
        Box bxAlmoada = new Box(0.03f, 0.0075f, 0.06f, paraTextura, almoada);
        Box bxAlmoada2 = new Box(0.03f, 0.0075f, 0.06f, paraTextura, almoada);
        Box bxburo = new Box(0.03f, 0.03f, 0.03f, paraTextura, muebles);
        Box bxburofondo = new Box(0.002f, 0.025f, 0.025f, paraTextura, ventana);
        Box bxburoPuerta = new Box(0.002f, 0.025f, 0.025f, paraTextura, muebles);
        bxburoPuerta.setAppearance(2,buro);
        Box bxPata = new Box(0.005f, 0.025f, 0.005f, paraTextura, muebles);
        Box bxPata2 = new Box(0.005f, 0.025f, 0.005f, paraTextura, muebles);
        Box bxPata3 = new Box(0.005f, 0.025f, 0.005f, paraTextura, muebles);
        Box bxPata4 = new Box(0.005f, 0.025f, 0.005f, paraTextura, muebles);
        Box bxPuerta = new Box(0.065f, 0.08f, 0.01f, paraTextura, ventana);
        Box bxbase = new Box(0.1f, 0.16f, 0.05f, paraTextura, pared);
        Box bxbaseDer = new Box(0.025f, 0.1f, 0.025f, paraTextura, pared);
        Box bxbaseDer2 = new Box(0.025f, 0.025f, 0.035f, paraTextura, pared);
        Box bxbaseIzq = new Box(0.025f, 0.1f, 0.025f, paraTextura, pared);
        Box bxbaseIzq2 = new Box(0.025f, 0.025f, 0.035f, paraTextura, pared);
        Box bxSilla = new Box(0.02f, 0.004f, 0.02f, paraTextura, filo);
        Box bxSilla2 = new Box(0.004f, 0.02f, 0.02f, paraTextura, filo);
        Box bx2Silla = new Box(0.02f, 0.004f, 0.02f, paraTextura, filo);
        Box bx2Silla2 = new Box(0.004f, 0.02f, 0.02f, paraTextura, filo);
        Box bx3Silla = new Box(0.02f, 0.004f, 0.02f, paraTextura, filo);
        Box bx3Silla2 = new Box(0.004f, 0.02f, 0.02f, paraTextura, filo);
        Box bx4Silla = new Box(0.02f, 0.004f, 0.02f, paraTextura, filo);
        Box bx4Silla2 = new Box(0.004f, 0.02f, 0.02f, paraTextura, filo);
        Box bx5Silla = new Box(0.02f, 0.004f, 0.02f, paraTextura, filo);
        Box bx5Silla2 = new Box(0.004f, 0.02f, 0.02f, paraTextura, filo);
        Box bx6Silla = new Box(0.02f, 0.004f, 0.02f, paraTextura, filo);
        Box bx6Silla2 = new Box(0.004f, 0.02f, 0.02f, paraTextura, filo);
        Box bx7Silla = new Box(0.02f, 0.004f, 0.02f, paraTextura, filo);
        Box bx7Silla2 = new Box(0.004f, 0.02f, 0.02f, paraTextura, filo);
        Box bx8Silla = new Box(0.02f, 0.004f, 0.02f, paraTextura, filo);
        Box bx8Silla2 = new Box(0.004f, 0.02f, 0.02f, paraTextura, filo);
        Box bx9Silla = new Box(0.02f, 0.004f, 0.02f, paraTextura, filo);
        Box bx9Silla2 = new Box(0.004f, 0.02f, 0.02f, paraTextura, filo);
        Box bx10Silla = new Box(0.02f, 0.004f, 0.02f, paraTextura, filo);
        Box bx10Silla2 = new Box(0.004f, 0.02f, 0.02f, paraTextura, filo);
        Cylinder cybisagraDer = new Cylinder(0.0015f, 0.02f, paraTextura, filo);
        Cylinder cybisagra2Der = new Cylinder(0.0015f, 0.02f, paraTextura, filo);
        Cylinder cybisagraIzq = new Cylinder(0.0015f, 0.02f, paraTextura, filo);
        Cylinder cybisagra2Izq = new Cylinder(0.0015f, 0.02f, paraTextura, filo);      
        Cylinder cySilla = new Cylinder(0.0025f, 0.015f, paraTextura, filo);
        Cylinder cy2Silla = new Cylinder(0.0025f, 0.015f, paraTextura, filo);
        Cylinder cy3Silla = new Cylinder(0.0025f, 0.015f, paraTextura, filo);
        Cylinder cy4Silla = new Cylinder(0.0025f, 0.015f, paraTextura, filo);
        Cylinder cy5Silla = new Cylinder(0.0025f, 0.015f, paraTextura, filo);
        Cylinder cy6Silla = new Cylinder(0.0025f, 0.015f, paraTextura, filo);
        Cylinder cy7Silla = new Cylinder(0.0025f, 0.015f, paraTextura, filo);
        Cylinder cy8Silla = new Cylinder(0.0025f, 0.015f, paraTextura, filo);
        Cylinder cy9Silla = new Cylinder(0.0025f, 0.015f, paraTextura, filo);
        Cylinder cy10Silla = new Cylinder(0.0025f, 0.015f, paraTextura, filo);
        Cone cnSilla = new Cone(0.015f, 0.01f, paraTextura, filo);
        Cone cn2Silla = new Cone(0.015f, 0.01f, paraTextura, filo);
        Cone cn3Silla = new Cone(0.015f, 0.01f, paraTextura, filo);
        Cone cn4Silla = new Cone(0.015f, 0.01f, paraTextura, filo);
        Cone cn5Silla = new Cone(0.015f, 0.01f, paraTextura, filo);
        Cone cn6Silla = new Cone(0.015f, 0.01f, paraTextura, filo);
        Cone cn7Silla = new Cone(0.015f, 0.01f, paraTextura, filo);
        Cone cn8Silla = new Cone(0.015f, 0.01f, paraTextura, filo);
        Cone cn9Silla = new Cone(0.015f, 0.01f, paraTextura, filo);
        Cone cn10Silla = new Cone(0.015f, 0.01f, paraTextura, filo);
        Cone cnConobase= new Cone(0.06f, 0.1f, paraTextura, techo);
        Cone cnConobase2 = new Cone(0.035f, 0.25f, paraTextura, techo);
        Sphere spburo = new Sphere(0.003f, paraTextura, defautl);
        //Luz
        Color3f cololuz = new Color3f(Color.white);
        Vector3f dirluz = new Vector3f(-0.01f, 0.0f, -0.01f);
        DirectionalLight luz = new DirectionalLight(cololuz, dirluz);
        luz.setInfluencingBounds(new BoundingSphere(new Point3d(0, 0, 0), 100));
        //Base
        Transform3D t3dBase = new Transform3D();
        t3dBase.set(new Vector3f(0.0f, -0.26f, 0.0f));
        //  t3dBase.setScale(0.1);
        tgBase = new TransformGroup(t3dBase);
        tgBase.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
        tgBase.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        tgBase.addChild(bxbase);
        //Torre Izquierda sexta parte
        Transform3D t3dTorreBase = new Transform3D();
        t3dTorreBase.set(new Vector3f(0.0f, 0.21f, 0.0f));
        TransformGroup tgTorreBase = new TransformGroup(t3dTorreBase);
        tgTorreBase.addChild(cnConobase);
        tgBase.addChild(tgTorreBase);
        //Torre Izquierda sextima parte
        Transform3D t3dTorreBase2 = new Transform3D();
        t3dTorreBase2.set(new Vector3f(0.0f, 0.1f, 0.0f));
        TransformGroup tgTorreBase2 = new TransformGroup(t3dTorreBase2);
        tgTorreBase2.addChild(cnConobase2);
        tgTorreBase.addChild(tgTorreBase2);
        //Puerta
        Transform3D t3dPuerta = new Transform3D();
        t3dPuerta.set(new Vector3f(0.0f, -0.075f, 0.041f));
        TransformGroup tgPuerta = new TransformGroup(t3dPuerta);
        tgPuerta.addChild(bxPuerta);
        tgBase.addChild(tgPuerta);
        //Bisagra Derecha
        Transform3D t3dBisagraDer = new Transform3D();
        t3dBisagraDer.set(new Vector3f(0.065f, 0.045f, 0.0096f));
        tgBisagraDer = new TransformGroup(t3dBisagraDer);
        tgBisagraDer.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
        tgBisagraDer.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        tgBisagraDer.addChild(cybisagraDer);
        tgPuerta.addChild(tgBisagraDer);
        //Bisagra 2 Derecha
        Transform3D t3dBisagra2Der = new Transform3D();
        t3dBisagra2Der.set(new Vector3f(0.065f, -0.045f, 0.0096f));
        TransformGroup tgBisagra2Der = new TransformGroup(t3dBisagra2Der);
        tgBisagra2Der.addChild(cybisagra2Der);
        tgPuerta.addChild(tgBisagra2Der);
        //Puerta Derecha
        Transform3D t3dPuertaDer = new Transform3D();
        t3dPuertaDer.set(new Vector3f(-0.033f, -0.045f, 0.0f));
        TransformGroup tgPuertaDer = new TransformGroup(t3dPuertaDer);
        tgPuertaDer.addChild(bxPuertaDer);
        tgBisagraDer.addChild(tgPuertaDer);
        //Bisagra Izquierda
        Transform3D t3dBisagraIzq = new Transform3D();
        t3dBisagraIzq.set(new Vector3f(-0.065f, 0.045f, 0.0096f));
        tgBisagraIzq = new TransformGroup(t3dBisagraIzq);
        tgBisagraIzq.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
        tgBisagraIzq.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        tgBisagraIzq.addChild(cybisagraIzq);
        tgPuerta.addChild(tgBisagraIzq);
        //Bisagra 2 Izquierda
        Transform3D t3dBisagra2Izq = new Transform3D();
        t3dBisagra2Izq.set(new Vector3f(-0.065f, -0.045f, 0.0096f));
        TransformGroup tgBisagra2Izq = new TransformGroup(t3dBisagra2Izq);
        tgBisagra2Izq.addChild(cybisagra2Izq);
        tgPuerta.addChild(tgBisagra2Izq);
        //Puerta Izquierda
        Transform3D t3dPuertaIzq = new Transform3D();
        t3dPuertaIzq.set(new Vector3f(0.033f, -0.045f, 0.0f));
        TransformGroup tgPuertaIzq = new TransformGroup(t3dPuertaIzq);
        tgPuertaIzq.addChild(bxPuertaIzq);
        tgBisagraIzq.addChild(tgPuertaIzq);
        //Restaurante
        Transform3D t3dRestaurante = new Transform3D();
        t3dRestaurante.set(new Vector3f(0.0f, -0.04f, -0.55f));
        TransformGroup tgRestaurante = new TransformGroup(t3dRestaurante);
        tgRestaurante.addChild(bxRestaurante);
        tgBase.addChild(tgRestaurante);
        //Restaurante Techo
        Transform3D t3dRestauranteTecho = new Transform3D();
        t3dRestauranteTecho.set(new Vector3f(0.0f, 0.0f, 0.0f));
        TransformGroup tgRestauranteTecho = new TransformGroup(t3dRestauranteTecho);
        tgRestauranteTecho.addChild(bxRestauranteTecho);
        tgRestaurante.addChild(tgRestauranteTecho);
        //Cama
        Transform3D t3dCama = new Transform3D();
        t3dCama.set(new Vector3f(-0.046f, 0.015f, 0.3f));
        TransformGroup tgCama = new TransformGroup(t3dCama);
        tgCama.addChild(bxCama);
        tgRestauranteTecho.addChild(tgCama);
        //Cobija
        Transform3D t3dColchon = new Transform3D();
        t3dColchon.set(new Vector3f(0.0292f, 0.0076f, 0.0f));
        TransformGroup tgColchon = new TransformGroup(t3dColchon);
        tgColchon.addChild(bxCobija);
        tgCama.addChild(tgColchon);
        //Almoada
        Transform3D t3dAlmoada = new Transform3D();
        t3dAlmoada.set(new Vector3f(-0.12f, 0.01f, 0.059f));
        TransformGroup tgAlmoada = new TransformGroup(t3dAlmoada);
        tgAlmoada.addChild(bxAlmoada);
        tgCama.addChild(tgAlmoada);
        //Almoada 2
        Transform3D t3dAlmoada2 = new Transform3D();
        t3dAlmoada2.set(new Vector3f(-0.12f, 0.01f, -0.059f));
        TransformGroup tgAlmoada2 = new TransformGroup(t3dAlmoada2);
        tgAlmoada2.addChild(bxAlmoada2);
        tgCama.addChild(tgAlmoada2);
        //Buro
        Transform3D t3dBuro = new Transform3D();
        t3dBuro.set(new Vector3f(-0.15f, 0.035f, 0.01f));
        TransformGroup tgBuro = new TransformGroup(t3dBuro);
        tgBuro.addChild(bxburo);
        tgRestauranteTecho.addChild(tgBuro);
        //Fondo de Buro
        Transform3D t3dBuroFondo = new Transform3D();
        t3dBuroFondo.set(new Vector3f(0.0285f, 0.0f, 0.0f));
        TransformGroup tgBuroFondo = new TransformGroup(t3dBuroFondo);
        tgBuroFondo.addChild(bxburofondo);
        tgBuro.addChild(tgBuroFondo);
        //bisagra de Buro
        Transform3D t3dBurosp = new Transform3D();
        t3dBurosp.set(new Vector3f(0.0295f, 0.0f, 0.022f));
        tgBurosp = new TransformGroup(t3dBurosp);
        tgBurosp.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
        tgBurosp.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        tgBurosp.addChild(spburo);
        tgBuro.addChild(tgBurosp);
        //Puerta de Buro
        Transform3D t3dBuroPuerta = new Transform3D();
        t3dBuroPuerta.set(new Vector3f(0.0f, 0.0f, -0.021f));
        TransformGroup tgBuroPuerta = new TransformGroup(t3dBuroPuerta);
        tgBuroPuerta.addChild(bxburoPuerta);
        tgBurosp.addChild(tgBuroPuerta);
        //Restaurante Pared Derecha
        Transform3D t3dRestauranteParedDer = new Transform3D();
        t3dRestauranteParedDer.set(new Vector3f(0.189f, -0.059f, 0.0f));
        TransformGroup tgRestauranteParedDer = new TransformGroup(t3dRestauranteParedDer);
        tgRestauranteParedDer.addChild(bxRestauranteparedDer);
        tgRestauranteTecho.addChild(tgRestauranteParedDer);
        //Restaurante Pared Izquierda
        Transform3D t3dRestauranteParedIzq = new Transform3D();
        t3dRestauranteParedIzq.set(new Vector3f(-0.189f, -0.059f, 0.0f));
        TransformGroup tgRestauranteParedIzq = new TransformGroup(t3dRestauranteParedIzq);
        tgRestauranteParedIzq.addChild(bxRestauranteparedIzq);
        tgRestauranteTecho.addChild(tgRestauranteParedIzq);
        //Restaurante Pared Adelante
        Transform3D t3dRestauranteParedAdelante = new Transform3D();
        t3dRestauranteParedAdelante.set(new Vector3f(0.0f, -0.059f, 0.49f));
        TransformGroup tgRestauranteParedAdelante = new TransformGroup(t3dRestauranteParedAdelante);
        tgRestauranteParedAdelante.addChild(bxRestauranteparedAdelante);
        tgRestauranteTecho.addChild(tgRestauranteParedAdelante);
        //Restaurante Pared Atras
        Transform3D t3dRestauranteParedAtras = new Transform3D();
        t3dRestauranteParedAtras.set(new Vector3f(0.0f, -0.059f, -0.49f));
        TransformGroup tgRestauranteParedAtras = new TransformGroup(t3dRestauranteParedAtras);
        tgRestauranteParedAtras.addChild(bxRestauranteparedAtras);
        tgRestauranteTecho.addChild(tgRestauranteParedAtras);
        //Cuarto Techo
        Transform3D t3dCuartoTecho = new Transform3D();
        t3dCuartoTecho.set(new Vector3f(0.0f, 0.114f, 0.0f));
        TransformGroup tgCuartoTecho = new TransformGroup(t3dCuartoTecho);
        tgCuartoTecho.addChild(bxCuartoTecho);
        tgRestauranteTecho.addChild(tgCuartoTecho);
        //Cuarto Pared Derecha
        Transform3D t3dCuartoParedDer = new Transform3D();
        t3dCuartoParedDer.set(new Vector3f(0.189f, 0.059f, 0.0f));
        TransformGroup tgCuartoParedDer = new TransformGroup(t3dCuartoParedDer);
        tgCuartoParedDer.addChild(bxCuartoparedDer);
        tgRestauranteTecho.addChild(tgCuartoParedDer);
        //Cuarto Pared Izquierda
        Transform3D t3dCuartoParedIzq = new Transform3D();
        t3dCuartoParedIzq.set(new Vector3f(-0.189f, 0.059f, 0.0f));
        TransformGroup tgCuartoParedIzq = new TransformGroup(t3dCuartoParedIzq);
        tgCuartoParedIzq.addChild(bxCuartoparedIzq);
        tgRestauranteTecho.addChild(tgCuartoParedIzq);
        //Cuarto Pared Adelante
        Transform3D t3dCuartoParedAdelante = new Transform3D();
        t3dCuartoParedAdelante.set(new Vector3f(0.0f, 0.059f, 0.49f));
        TransformGroup tgCuartoParedAdelante = new TransformGroup(t3dCuartoParedAdelante);
        tgCuartoParedAdelante.addChild(bxCuartoparedAdelante);
        tgRestauranteTecho.addChild(tgCuartoParedAdelante);
        //Cuarto Pared Atras
        Transform3D t3dCuartoParedAtras = new Transform3D();
        t3dCuartoParedAtras.set(new Vector3f(0.0f, 0.059f, -0.49f));
        TransformGroup tgCuartoParedAtras = new TransformGroup(t3dCuartoParedAtras);
        tgCuartoParedAtras.addChild(bxCuartoparedAtras);
        tgRestauranteTecho.addChild(tgCuartoParedAtras);
        //Restaurante piso
        Transform3D t3dRestaurantePiso = new Transform3D();
        t3dRestaurantePiso.set(new Vector3f(0.0f, -0.118f, 0.0f));
        TransformGroup tgRestaurantePiso = new TransformGroup(t3dRestaurantePiso);
        tgRestaurantePiso.addChild(bxRestaurantepiso);
        tgRestauranteTecho.addChild(tgRestaurantePiso);
        //Mesa
        Transform3D t3dMesa = new Transform3D();
        t3dMesa.set(new Vector3f(-0.025f, 0.05f, 0.0f));
        TransformGroup tgMesa = new TransformGroup(t3dMesa);
        tgMesa.addChild(bxMesa);
        tgRestaurantePiso.addChild(tgMesa);
        //Pata
        Transform3D t3dPata = new Transform3D();
        t3dPata.set(new Vector3f(0.06f, 0.0265f, 0.19f));
        TransformGroup tgPata = new TransformGroup(t3dPata);
        tgPata.addChild(bxPata);
        tgRestaurantePiso.addChild(tgPata);
        //Pata 2
        Transform3D t3dPata2 = new Transform3D();
        t3dPata2.set(new Vector3f(-0.11f, 0.0265f, 0.19f));
        TransformGroup tgPata2 = new TransformGroup(t3dPata2);
        tgPata2.addChild(bxPata2);
        tgRestaurantePiso.addChild(tgPata2);
        //Pata 3
        Transform3D t3dPata3 = new Transform3D();
        t3dPata3.set(new Vector3f(0.06f, 0.0265f, -0.19f));
        TransformGroup tgPata3 = new TransformGroup(t3dPata3);
        tgPata3.addChild(bxPata3);
        tgRestaurantePiso.addChild(tgPata3);
        //Pata 4
        Transform3D t3dPata4 = new Transform3D();
        t3dPata4.set(new Vector3f(-0.11f, 0.0265f, -0.19f));
        TransformGroup tgPata4 = new TransformGroup(t3dPata4);
        tgPata4.addChild(bxPata4);
        tgRestaurantePiso.addChild(tgPata4);
        //Silla
        Transform3D t3dSilla = new Transform3D();
        t3dSilla.set(new Vector3f(0.08f, 0.009f, 0.13f));
        tgSilla = new TransformGroup(t3dSilla);
        tgSilla.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
        tgSilla.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        tgSilla.addChild(cnSilla);
        tgRestaurantePiso.addChild(tgSilla);
        //Silla 2
        Transform3D t3dSilla2 = new Transform3D();
        t3dSilla2.set(new Vector3f(0.0f, 0.01f, 0.0f));
        TransformGroup tgSilla2 = new TransformGroup(t3dSilla2);
        tgSilla2.addChild(cySilla);
        tgSilla.addChild(tgSilla2);
        //Silla 3
        Transform3D t3dSilla3 = new Transform3D();
        t3dSilla3.set(new Vector3f(0.0f, 0.01f, 0.0f));
        TransformGroup tgSilla3 = new TransformGroup(t3dSilla3);
        tgSilla3.addChild(bxSilla);
        tgSilla2.addChild(tgSilla3);
        //Silla 4
        Transform3D t3dSilla4 = new Transform3D();
        t3dSilla4.set(new Vector3f(0.018f, 0.02f, 0.0f));
        TransformGroup tgSilla4 = new TransformGroup(t3dSilla4);
        tgSilla4.addChild(bxSilla2);
        tgSilla3.addChild(tgSilla4);
        //2 Silla
        Transform3D t3d2Silla = new Transform3D();
        t3d2Silla.set(new Vector3f(0.08f, 0.009f, 0.07f));
        tg2Silla = new TransformGroup(t3d2Silla);
        tg2Silla.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
        tg2Silla.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        tg2Silla.addChild(cn2Silla);
        tgRestaurantePiso.addChild(tg2Silla);
        //2 Silla 2
        Transform3D t3d2Silla2 = new Transform3D();
        t3d2Silla2.set(new Vector3f(0.0f, 0.01f, 0.0f));
        TransformGroup tg2Silla2 = new TransformGroup(t3d2Silla2);
        tg2Silla2.addChild(cy2Silla);
        tg2Silla.addChild(tg2Silla2);
        //2 Silla 3
        Transform3D t3d2Silla3 = new Transform3D();
        t3d2Silla3.set(new Vector3f(0.0f, 0.01f, 0.0f));
        TransformGroup tg2Silla3 = new TransformGroup(t3d2Silla3);
        tg2Silla3.addChild(bx2Silla);
        tg2Silla2.addChild(tg2Silla3);
        //2 Silla 4
        Transform3D t3d2Silla4 = new Transform3D();
        t3d2Silla4.set(new Vector3f(0.018f, 0.02f, 0.0f));
        TransformGroup tg2Silla4 = new TransformGroup(t3d2Silla4);
        tg2Silla4.addChild(bx2Silla2);
        tg2Silla3.addChild(tg2Silla4);
        //3 Silla
        Transform3D t3d3Silla = new Transform3D();
        t3d3Silla.set(new Vector3f(0.08f, 0.009f, 0.0f));
        tg3Silla = new TransformGroup(t3d3Silla);
        tg3Silla.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
        tg3Silla.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        tg3Silla.addChild(cn3Silla);
        tgRestaurantePiso.addChild(tg3Silla);
        //3 Silla 2
        Transform3D t3d3Silla2 = new Transform3D();
        t3d3Silla2.set(new Vector3f(0.0f, 0.01f, 0.0f));
        TransformGroup tg3Silla2 = new TransformGroup(t3d3Silla2);
        tg3Silla2.addChild(cy3Silla);
        tg3Silla.addChild(tg3Silla2);
        //3 Silla 3
        Transform3D t3d3Silla3 = new Transform3D();
        t3d3Silla3.set(new Vector3f(0.0f, 0.01f, 0.0f));
        TransformGroup tg3Silla3 = new TransformGroup(t3d3Silla3);
        tg3Silla3.addChild(bx3Silla);
        tg3Silla2.addChild(tg3Silla3);
        //3 Silla 4
        Transform3D t3d3Silla4 = new Transform3D();
        t3d3Silla4.set(new Vector3f(0.018f, 0.02f, 0.0f));
        TransformGroup tg3Silla4 = new TransformGroup(t3d3Silla4);
        tg3Silla4.addChild(bx3Silla2);
        tg3Silla3.addChild(tg3Silla4);
        //4 Silla
        Transform3D t3d4Silla = new Transform3D();
        t3d4Silla.set(new Vector3f(0.08f, 0.009f, -0.07f));
        tg4Silla = new TransformGroup(t3d4Silla);
        tg4Silla.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
        tg4Silla.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        tg4Silla.addChild(cn4Silla);
        tgRestaurantePiso.addChild(tg4Silla);
        //4 Silla 2
        Transform3D t3d4Silla2 = new Transform3D();
        t3d4Silla2.set(new Vector3f(0.0f, 0.01f, 0.0f));
        TransformGroup tg4Silla2 = new TransformGroup(t3d4Silla2);
        tg4Silla2.addChild(cy4Silla);
        tg4Silla.addChild(tg4Silla2);
        //4 Silla 3
        Transform3D t3d4Silla3 = new Transform3D();
        t3d4Silla3.set(new Vector3f(0.0f, 0.01f, 0.0f));
        TransformGroup tg4Silla3 = new TransformGroup(t3d4Silla3);
        tg4Silla3.addChild(bx4Silla);
        tg4Silla2.addChild(tg4Silla3);
        //4 Silla 4
        Transform3D t3d4Silla4 = new Transform3D();
        t3d4Silla4.set(new Vector3f(0.018f, 0.02f, 0.0f));
        TransformGroup tg4Silla4 = new TransformGroup(t3d4Silla4);
        tg4Silla4.addChild(bx4Silla2);
        tg4Silla3.addChild(tg4Silla4);
        //5 Silla
        Transform3D t3d5Silla = new Transform3D();
        t3d5Silla.set(new Vector3f(0.08f, 0.009f, -0.13f));
        tg5Silla = new TransformGroup(t3d5Silla);
        tg5Silla.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
        tg5Silla.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        tg5Silla.addChild(cn5Silla);
        tgRestaurantePiso.addChild(tg5Silla);
        //5 Silla 2
        Transform3D t3d5Silla2 = new Transform3D();
        t3d5Silla2.set(new Vector3f(0.0f, 0.01f, 0.0f));
        TransformGroup tg5Silla2 = new TransformGroup(t3d5Silla2);
        tg5Silla2.addChild(cy5Silla);
        tg5Silla.addChild(tg5Silla2);
        //5 Silla 3
        Transform3D t3d5Silla3 = new Transform3D();
        t3d5Silla3.set(new Vector3f(0.0f, 0.01f, 0.0f));
        TransformGroup tg5Silla3 = new TransformGroup(t3d5Silla3);
        tg5Silla3.addChild(bx5Silla);
        tg5Silla2.addChild(tg5Silla3);
        //5 Silla 4
        Transform3D t3d5Silla4 = new Transform3D();
        t3d5Silla4.set(new Vector3f(0.018f, 0.02f, 0.0f));
        TransformGroup tg5Silla4 = new TransformGroup(t3d5Silla4);
        tg5Silla4.addChild(bx5Silla2);
        tg5Silla3.addChild(tg5Silla4);
        //6 Silla
        Transform3D t3d6Silla = new Transform3D();
        t3d6Silla.set(new Vector3f(-0.13f, 0.009f, 0.13f));
        tg6Silla = new TransformGroup(t3d6Silla);
        tg6Silla.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
        tg6Silla.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        tg6Silla.addChild(cn6Silla);
        tgRestaurantePiso.addChild(tg6Silla);
        //6 Silla 2
        Transform3D t3d6Silla2 = new Transform3D();
        t3d6Silla2.set(new Vector3f(0.0f, 0.01f, 0.0f));
        TransformGroup tg6Silla2 = new TransformGroup(t3d6Silla2);
        tg6Silla2.addChild(cy6Silla);
        tg6Silla.addChild(tg6Silla2);
        //6 Silla 3
        Transform3D t3d6Silla3 = new Transform3D();
        t3d6Silla3.set(new Vector3f(0.0f, 0.01f, 0.0f));
        TransformGroup tg6Silla3 = new TransformGroup(t3d6Silla3);
        tg6Silla3.addChild(bx6Silla);
        tg6Silla2.addChild(tg6Silla3);
        //6 Silla 4
        Transform3D t3d6Silla4 = new Transform3D();
        t3d6Silla4.set(new Vector3f(-0.018f, 0.02f, 0.0f));
        TransformGroup tg6Silla4 = new TransformGroup(t3d6Silla4);
        tg6Silla4.addChild(bx6Silla2);
        tg6Silla3.addChild(tg6Silla4);
        //7 Silla
        Transform3D t3d7Silla = new Transform3D();
        t3d7Silla.set(new Vector3f(-0.13f, 0.009f, 0.07f));
        tg7Silla = new TransformGroup(t3d7Silla);
        tg7Silla.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
        tg7Silla.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        tg7Silla.addChild(cn7Silla);
        tgRestaurantePiso.addChild(tg7Silla);
        //7 Silla 2
        Transform3D t3d7Silla2 = new Transform3D();
        t3d7Silla2.set(new Vector3f(0.0f, 0.01f, 0.0f));
        TransformGroup tg7Silla2 = new TransformGroup(t3d7Silla2);
        tg7Silla2.addChild(cy7Silla);
        tg7Silla.addChild(tg7Silla2);
        //7 Silla 3
        Transform3D t3d7Silla3 = new Transform3D();
        t3d7Silla3.set(new Vector3f(0.0f, 0.01f, 0.0f));
        TransformGroup tg7Silla3 = new TransformGroup(t3d7Silla3);
        tg7Silla3.addChild(bx7Silla);
        tg7Silla2.addChild(tg7Silla3);
        //7 Silla 4
        Transform3D t3d7Silla4 = new Transform3D();
        t3d7Silla4.set(new Vector3f(-0.018f, 0.02f, 0.0f));
        TransformGroup tg7Silla4 = new TransformGroup(t3d7Silla4);
        tg7Silla4.addChild(bx7Silla2);
        tg7Silla3.addChild(tg7Silla4);
        //8 Silla
        Transform3D t3d8Silla = new Transform3D();
        t3d8Silla.set(new Vector3f(-0.13f, 0.009f, 0.0f));
        tg8Silla = new TransformGroup(t3d8Silla);
        tg8Silla.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
        tg8Silla.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        tg8Silla.addChild(cn8Silla);
        tgRestaurantePiso.addChild(tg8Silla);
        //8 Silla 2
        Transform3D t3d8Silla2 = new Transform3D();
        t3d8Silla2.set(new Vector3f(0.0f, 0.01f, 0.0f));
        TransformGroup tg8Silla2 = new TransformGroup(t3d8Silla2);
        tg8Silla2.addChild(cy8Silla);
        tg8Silla.addChild(tg8Silla2);
        //8 Silla 3
        Transform3D t3d8Silla3 = new Transform3D();
        t3d8Silla3.set(new Vector3f(0.0f, 0.01f, 0.0f));
        TransformGroup tg8Silla3 = new TransformGroup(t3d8Silla3);
        tg8Silla3.addChild(bx8Silla);
        tg8Silla2.addChild(tg8Silla3);
        //8 Silla 4
        Transform3D t3d8Silla4 = new Transform3D();
        t3d8Silla4.set(new Vector3f(-0.018f, 0.02f, 0.0f));
        TransformGroup tg8Silla4 = new TransformGroup(t3d8Silla4);
        tg8Silla4.addChild(bx8Silla2);
        tg8Silla3.addChild(tg8Silla4);
        //9 Silla
        Transform3D t3d9Silla = new Transform3D();
        t3d9Silla.set(new Vector3f(-0.13f, 0.009f, -0.07f));
        tg9Silla = new TransformGroup(t3d9Silla);
        tg9Silla.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
        tg9Silla.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        tg9Silla.addChild(cn9Silla);
        tgRestaurantePiso.addChild(tg9Silla);
        //9 Silla 2
        Transform3D t3d9Silla2 = new Transform3D();
        t3d9Silla2.set(new Vector3f(0.0f, 0.01f, 0.0f));
        TransformGroup tg9Silla2 = new TransformGroup(t3d9Silla2);
        tg9Silla2.addChild(cy9Silla);
        tg9Silla.addChild(tg9Silla2);
        //9 Silla 3
        Transform3D t3d9Silla3 = new Transform3D();
        t3d9Silla3.set(new Vector3f(0.0f, 0.01f, 0.0f));
        TransformGroup tg9Silla3 = new TransformGroup(t3d9Silla3);
        tg9Silla3.addChild(bx9Silla);
        tg9Silla2.addChild(tg9Silla3);
        //9 Silla 4
        Transform3D t3d9Silla4 = new Transform3D();
        t3d9Silla4.set(new Vector3f(-0.018f, 0.02f, 0.0f));
        TransformGroup tg9Silla4 = new TransformGroup(t3d9Silla4);
        tg9Silla4.addChild(bx9Silla2);
        tg9Silla3.addChild(tg9Silla4);
        //10 Silla
        Transform3D t3d10Silla = new Transform3D();
        t3d10Silla.set(new Vector3f(-0.13f, 0.009f, -0.13f));
        tg10Silla = new TransformGroup(t3d10Silla);
        tg10Silla.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
        tg10Silla.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        tg10Silla.addChild(cn10Silla);
        tgRestaurantePiso.addChild(tg10Silla);
        //10 Silla 2
        Transform3D t3d10Silla2 = new Transform3D();
        t3d10Silla2.set(new Vector3f(0.0f, 0.01f, 0.0f));
        TransformGroup tg10Silla2 = new TransformGroup(t3d10Silla2);
        tg10Silla2.addChild(cy10Silla);
        tg10Silla.addChild(tg10Silla2);
        //10 Silla 3
        Transform3D t3d10Silla3 = new Transform3D();
        t3d10Silla3.set(new Vector3f(0.0f, 0.01f, 0.0f));
        TransformGroup tg10Silla3 = new TransformGroup(t3d10Silla3);
        tg10Silla3.addChild(bx10Silla);
        tg10Silla2.addChild(tg10Silla3);
        //10 Silla 4
        Transform3D t3d10Silla4 = new Transform3D();
        t3d10Silla4.set(new Vector3f(-0.018f, 0.02f, 0.0f));
        TransformGroup tg10Silla4 = new TransformGroup(t3d10Silla4);
        tg10Silla4.addChild(bx10Silla2);
        tg10Silla3.addChild(tg10Silla4);
        //Pared de la Derecha
        Transform3D t3dBaseDer = new Transform3D();
        t3dBaseDer.set(new Vector3f(0.125f, -0.06f, -0.025f));
        TransformGroup tgBaseDer = new TransformGroup(t3dBaseDer);
        tgBaseDer.addChild(bxbaseDer);
        tgBase.addChild(tgBaseDer);
        //Pared de la Derecha parte dos
        Transform3D t3dBaseDer2 = new Transform3D();
        t3dBaseDer2.set(new Vector3f(0.0f, 0.12f, 0.01f));
        TransformGroup tgBaseDer2 = new TransformGroup(t3dBaseDer2);
        tgBaseDer2.addChild(bxbaseDer2);
        tgBaseDer.addChild(tgBaseDer2);
        //Ventana pared Derecha
        Transform3D t3dVentanaParedDer = new Transform3D();
        t3dVentanaParedDer.set(new Vector3f(0.0f, 0.019f, 0.03f));
        TransformGroup tgVentanaParedDer = new TransformGroup(t3dVentanaParedDer);
        tgVentanaParedDer.addChild(bxventanaPared);
        tgBaseDer2.addChild(tgVentanaParedDer);
        //Cristal de Ventanas pared Derechas
        Transform3D t3dCristalParedDer = new Transform3D();
        t3dCristalParedDer.set(new Vector3f(0.0f, 0.0f, 0.0055f));
        TransformGroup tgCristalParedDer = new TransformGroup(t3dCristalParedDer);
        tgCristalParedDer.addChild(bxcristalPared);
        tgVentanaParedDer.addChild(tgCristalParedDer);
        //Pared de la Izquierda
        Transform3D t3dBaseIzq = new Transform3D();
        t3dBaseIzq.set(new Vector3f(-0.125f, -0.06f, -0.025f));
        TransformGroup tgBaseIzq  = new TransformGroup(t3dBaseIzq);
        tgBaseIzq.addChild(bxbaseIzq);
        tgBase.addChild(tgBaseIzq);
        //Pared de la Izquierda parte dos
        Transform3D t3dBaseIzq2 = new Transform3D();
        t3dBaseIzq2.set(new Vector3f(0.0f, 0.12f, 0.01f));
        TransformGroup tgBaseIzq2 = new TransformGroup(t3dBaseIzq2);
        tgBaseIzq2.addChild(bxbaseIzq2);
        tgBaseIzq.addChild(tgBaseIzq2);
        //Ventana pared Izquierda
        Transform3D t3dVentanaParedIzq = new Transform3D();
        t3dVentanaParedIzq.set(new Vector3f(0.0f, 0.019f, 0.03f));
        TransformGroup tgVentanaParedIzq = new TransformGroup(t3dVentanaParedIzq);
        tgVentanaParedIzq.addChild(bxventanaPared2);
        tgBaseIzq2.addChild(tgVentanaParedIzq);
        //Cristal de Ventanas pared Izquierda
        Transform3D t3dCristalParedIzq = new Transform3D();
        t3dCristalParedIzq.set(new Vector3f(0.0f, 0.0f, 0.0055f));
        TransformGroup tgCristalParedIzq = new TransformGroup(t3dCristalParedIzq);
        tgCristalParedIzq.addChild(bxcristalPared2);
        tgVentanaParedIzq.addChild(tgCristalParedIzq);
        //torre 1
        Transform3D t3dtorre1 = new Transform3D();
        t3dtorre1.set(new Vector3f(0.0f, 0.0f, 0.0f));
        TransformGroup tgtorre1 = new TransformGroup(t3dtorre1);
        tgtorre1.addChild(torre());
        tgBaseIzq.addChild(tgtorre1);
        //torre 2
        Transform3D t3dtorre2 = new Transform3D();
        t3dtorre2.set(new Vector3f(0.15f, 0.0f, 0.0f));
        TransformGroup tgtorre2 = new TransformGroup(t3dtorre2);
        tgtorre2.addChild(torre());
        tgBaseDer.addChild(tgtorre2);
        //torre 3
        Transform3D t3dtorre3 = new Transform3D();
        Transform3D t3dGirarTorreY = new Transform3D();
        t3dGirarTorreY.rotY(Math.PI / 180 * 90);
        t3dtorre3.set(new Vector3f(0.12f, 0.0f, -0.25f));
        t3dtorre3.mul(t3dGirarTorreY);
        TransformGroup tgtorre3 = new TransformGroup(t3dtorre3);
        tgtorre3.addChild(torre());
        tgBaseDer.addChild(tgtorre3);
        //torre 4
        Transform3D t3dtorre4 = new Transform3D();
        Transform3D t3dGirarTorre2Y = new Transform3D();
        t3dGirarTorre2Y.rotY(Math.PI / 180 * 90);
        t3dtorre4.set(new Vector3f(0.12f, 0.0f, -0.45f));
        t3dtorre4.mul(t3dGirarTorre2Y);
        TransformGroup tgtorre4 = new TransformGroup(t3dtorre4);
        tgtorre4.addChild(torre());
        tgBaseDer.addChild(tgtorre4);
        //torre 5
        Transform3D t3dtorre5 = new Transform3D();
        Transform3D t3dGirarTorre3Y = new Transform3D();
        t3dGirarTorre3Y.rotY(Math.PI / 180 * 90);
        t3dtorre5.set(new Vector3f(0.12f, 0.0f, -0.65f));
        t3dtorre5.mul(t3dGirarTorre3Y);
        TransformGroup tgtorre5 = new TransformGroup(t3dtorre5);
        tgtorre5.addChild(torre());
        tgBaseDer.addChild(tgtorre5);
        //torre 6
        Transform3D t3dtorre6 = new Transform3D();
        Transform3D t3dGirarTorre4Y = new Transform3D();
        t3dGirarTorre4Y.rotY(Math.PI / 180 * 90);
        t3dtorre6.set(new Vector3f(0.12f, 0.0f, -0.85f));
        t3dtorre6.mul(t3dGirarTorre4Y);
        TransformGroup tgtorre6 = new TransformGroup(t3dtorre6);
        tgtorre6.addChild(torre());
        tgBaseDer.addChild(tgtorre6);
        //torre 7
        Transform3D t3dtorre7 = new Transform3D();
        Transform3D t3dGirarTorre5Y = new Transform3D();
        t3dGirarTorre5Y.rotY(Math.PI / 180 * 90);
        t3dtorre7.set(new Vector3f(0.12f, 0.0f, -1.05f));
        t3dtorre7.mul(t3dGirarTorre5Y);
        TransformGroup tgtorre7 = new TransformGroup(t3dtorre7);
        tgtorre7.addChild(torre());
        tgBaseDer.addChild(tgtorre7);
        //torre 8
        Transform3D t3dtorre8 = new Transform3D();
        Transform3D t3dGirarTorre6Y = new Transform3D();
        t3dGirarTorre6Y.rotY(Math.PI / 180 * 270);
        t3dtorre8.set(new Vector3f(-0.12f, 0.0f, -0.1f));
        t3dtorre8.mul(t3dGirarTorre6Y);
        TransformGroup tgtorre8 = new TransformGroup(t3dtorre8);
        tgtorre8.addChild(torre());
        tgBaseIzq.addChild(tgtorre8);
       //torre 9
        Transform3D t3dtorre9 = new Transform3D();
        Transform3D t3dGirarTorre7Y = new Transform3D();
        t3dGirarTorre7Y.rotY(Math.PI / 180 * 270);
        t3dtorre9.set(new Vector3f(-0.12f, 0.0f, -0.3f));
        t3dtorre9.mul(t3dGirarTorre7Y);
        TransformGroup tgtorre9 = new TransformGroup(t3dtorre9);
        tgtorre9.addChild(torre());
        tgBaseIzq.addChild(tgtorre9);
        //torre 10
        Transform3D t3dtorre10 = new Transform3D();
        Transform3D t3dGirarTorre8Y = new Transform3D();
        t3dGirarTorre8Y.rotY(Math.PI / 180 * 270);
        t3dtorre10.set(new Vector3f(-0.12f, 0.0f, -0.5f));
        t3dtorre10.mul(t3dGirarTorre8Y);
        TransformGroup tgtorre10 = new TransformGroup(t3dtorre10);
        tgtorre10.addChild(torre());
        tgBaseIzq.addChild(tgtorre10);       
        //torre 11
        Transform3D t3dtorre11 = new Transform3D();
        Transform3D t3dGirarTorre9Y = new Transform3D();
        t3dGirarTorre9Y.rotY(Math.PI / 180 * 270);
        t3dtorre11.set(new Vector3f(-0.12f, 0.0f, -0.7f));
        t3dtorre11.mul(t3dGirarTorre9Y);
        TransformGroup tgtorre11 = new TransformGroup(t3dtorre11);
        tgtorre11.addChild(torre());
        tgBaseIzq.addChild(tgtorre11);
        //torre 12
        Transform3D t3dtorre12 = new Transform3D();
        Transform3D t3dGirarTorre10Y = new Transform3D();
        t3dGirarTorre10Y.rotY(Math.PI / 180 * 270);
        t3dtorre12.set(new Vector3f(-0.12f, 0.0f, -0.9f));
        t3dtorre12.mul(t3dGirarTorre10Y);
        TransformGroup tgtorre12 = new TransformGroup(t3dtorre12);
        tgtorre12.addChild(torre());
        tgBaseIzq.addChild(tgtorre12);
        //Rotar con el mouse
        tgGiro = new TransformGroup();
        tgGiro.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
        tgGiro.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        //Mouse de codigo
        MouseRotate myMouseRotate = new MouseRotate();
        myMouseRotate.setTransformGroup(tgGiro);
        myMouseRotate.setSchedulingBounds(new BoundingSphere()); 
        //Hijos para que se muevan con el mouse 
        tgGiro.addChild(tgBase);
        //Lo que se muestra
        objRaiz.addChild(luz);
        objRaiz.addChild(tgGiro);
        objRaiz.addChild(myMouseRotate);
    }

    public BranchGroup torre(){
        BranchGroup torre = new BranchGroup();
        Box bxventanaIzq = new Box(0.006f, 0.006f, 0.006f, paraTextura, ventana);
        Box bxcristalIzq = new Box(0.006f, 0.006f, 0.001f, paraTextura, defautl);
        Box bxventanaIzq2 = new Box(0.006f, 0.006f, 0.006f, paraTextura, ventana);
        Box bxcristalIzq2 = new Box(0.006f, 0.006f, 0.001f, paraTextura, defautl);
        Box bxventanaIzq3 = new Box(0.006f, 0.006f, 0.006f, paraTextura, ventana);
        Box bxcristalIzq3 = new Box(0.006f, 0.006f, 0.001f, paraTextura, defautl);
        Box bxventanaIzqTor = new Box(0.006f, 0.006f, 0.006f, paraTextura, ventana);
        Box bxcristalIzqTor = new Box(0.006f, 0.006f, 0.001f, paraTextura, defautl);
        Box bxventanaIzqTor2 = new Box(0.006f, 0.006f, 0.006f, paraTextura, ventana);
        Box bxcristalIzqTor2 = new Box(0.006f, 0.006f, 0.001f, paraTextura, defautl);
        Box bxventanaIzqTor3 = new Box(0.006f, 0.006f, 0.006f, paraTextura, ventana);
        Box bxcristalIzqTor3 = new Box(0.006f, 0.006f, 0.001f, paraTextura, defautl);
        Cylinder cytorreIzq = new Cylinder(0.05f, 0.24f, paraTextura, pared);
        Cylinder cytorreIzq2 = new Cylinder(0.06f, 0.055f, paraTextura, pared);
        Cylinder cytorreIzq3 = new Cylinder(0.045f, 0.08f, paraTextura, pared);      
        Cone cnConoIzq = new Cone(0.07f, 0.12f, paraTextura, techo);
        Cone cnConoIzq2 = new Cone(0.06f, 0.1f, paraTextura, techo);
        Cone cnConoIzq3 = new Cone(0.035f, 0.25f, paraTextura, techo);
    //Torre Izquierda
        Transform3D t3dTorreIzq = new Transform3D();
        t3dTorreIzq.set(new Vector3f(-0.07f, 0.02f, -0.01f));
        TransformGroup tgTorreIzq = new TransformGroup(t3dTorreIzq);
        tgTorreIzq.addChild(cytorreIzq);
        //Torre Izquierda segunda parte
        Transform3D t3dTorreIzq2 = new Transform3D();
        t3dTorreIzq2.set(new Vector3f(0.0f, 0.145f, 0.0f));
        TransformGroup tgTorreIzq2 = new TransformGroup(t3dTorreIzq2);
        tgTorreIzq2.addChild(cytorreIzq2);
        tgTorreIzq.addChild(tgTorreIzq2);
        //Torre Izquierda tercer parte
        Transform3D t3dTorreIzq3 = new Transform3D();
        t3dTorreIzq3.set(new Vector3f(0.0f, 0.075f, 0.0f));
        TransformGroup tgTorreIzq3 = new TransformGroup(t3dTorreIzq3);
        tgTorreIzq3.addChild(cnConoIzq);
        tgTorreIzq2.addChild(tgTorreIzq3);
        //Torre Izquierda cuarta parte
        Transform3D t3dTorreIzq4 = new Transform3D();
        t3dTorreIzq4.set(new Vector3f(0.0f, -0.008f, 0.0f));
        TransformGroup tgTorreIzq4 = new TransformGroup(t3dTorreIzq4);
        tgTorreIzq4.addChild(cytorreIzq3);
        tgTorreIzq3.addChild(tgTorreIzq4);
        //Torre Izquierda sexta parte
        Transform3D t3dTorreIzq6 = new Transform3D();
        t3dTorreIzq6.set(new Vector3f(0.0f, 0.09f, 0.0f));
        TransformGroup tgTorreIzq6 = new TransformGroup(t3dTorreIzq6);
        tgTorreIzq6.addChild(cnConoIzq2);
        tgTorreIzq4.addChild(tgTorreIzq6);
        //Torre Izquierda sextima parte
        Transform3D t3dTorreIzq7 = new Transform3D();
        t3dTorreIzq7.set(new Vector3f(0.0f, 0.1f, 0.0f));
        TransformGroup tgTorreIzq7 = new TransformGroup(t3dTorreIzq7);
        tgTorreIzq7.addChild(cnConoIzq3);
        tgTorreIzq6.addChild(tgTorreIzq7);
        //Ventana torre Izquierda
        Transform3D t3dVentanaIzq = new Transform3D();
        t3dVentanaIzq.set(new Vector3f(0.0f, -0.07f, 0.054f));
        TransformGroup tgVentanaIzq = new TransformGroup(t3dVentanaIzq);
        tgVentanaIzq.addChild(bxventanaIzq);
        tgTorreIzq3.addChild(tgVentanaIzq);
        //Cristal de Ventanas Izquierda
        Transform3D t3dCristalIzq = new Transform3D();
        t3dCristalIzq.set(new Vector3f(0.0f, 0.0f, 0.0055f));
        TransformGroup tgCristalIzq = new TransformGroup(t3dCristalIzq);
        tgCristalIzq.addChild(bxcristalIzq);
        tgVentanaIzq.addChild(tgCristalIzq);
        //Ventana torre Izquierda 2
        Transform3D t3dVentanaIzq2 = new Transform3D();
        Transform3D t3dGirarVentanaIzqY = new Transform3D();
        t3dGirarVentanaIzqY.rotY(Math.PI / 180 * 45);
        t3dVentanaIzq2.set(new Vector3f(0.04f, -0.07f, 0.037f));
        t3dVentanaIzq2.mul(t3dGirarVentanaIzqY);
        TransformGroup tgVentanaIzq2 = new TransformGroup(t3dVentanaIzq2);
        tgVentanaIzq2.addChild(bxventanaIzq2);
        tgTorreIzq3.addChild(tgVentanaIzq2);
        //Cristal de Ventanas Izquierda 2
        Transform3D t3dCristalIzq2 = new Transform3D();
        t3dCristalIzq2.set(new Vector3f(0.0f, 0.0f, 0.0055f));
        TransformGroup tgCristalIzq2 = new TransformGroup(t3dCristalIzq2);
        tgCristalIzq2.addChild(bxcristalIzq2);
        tgVentanaIzq2.addChild(tgCristalIzq2);
        //Ventana torre Izquierda 3
        Transform3D t3dVentanaIzq3 = new Transform3D();
        Transform3D t3dGirarVentanaIzq2Y = new Transform3D();
        t3dGirarVentanaIzq2Y.rotY(Math.PI / 180 * 315);
        t3dVentanaIzq3.set(new Vector3f(-0.04f, -0.07f, 0.037f));
        t3dVentanaIzq3.mul(t3dGirarVentanaIzq2Y);
        TransformGroup tgVentanaIzq3 = new TransformGroup(t3dVentanaIzq3);
        tgVentanaIzq3.addChild(bxventanaIzq3);
        tgTorreIzq3.addChild(tgVentanaIzq3);
        //Cristal de Ventanas Izquierda 3
        Transform3D t3dCristalIzq3 = new Transform3D();
        t3dCristalIzq3.set(new Vector3f(0.0f, 0.0f, 0.0055f));
        TransformGroup tgCristalIzq3 = new TransformGroup(t3dCristalIzq3);
        tgCristalIzq3.addChild(bxcristalIzq3);
        tgVentanaIzq3.addChild(tgCristalIzq3);
        //Ventana torre 2 Izquierda
        Transform3D t3dVentanaSegundaIzq = new Transform3D();
        t3dVentanaSegundaIzq.set(new Vector3f(0.0f, 0.03f, 0.04f));
        TransformGroup tgVentanaSegundaIzq = new TransformGroup(t3dVentanaSegundaIzq);
        tgVentanaSegundaIzq.addChild(bxventanaIzqTor);
        tgTorreIzq4.addChild(tgVentanaSegundaIzq);
        //2 Cristal de Ventanas Izquierda
        Transform3D t3dCristalSegundaIzq = new Transform3D();
        t3dCristalSegundaIzq.set(new Vector3f(0.0f, 0.0f, 0.0055f));
        TransformGroup tgCristalSegundaIzq = new TransformGroup(t3dCristalSegundaIzq);
        tgCristalSegundaIzq.addChild(bxcristalIzqTor);
        tgVentanaSegundaIzq.addChild(tgCristalSegundaIzq);
        //Ventana torre 2 Izquierda 2
        Transform3D t3dVentanaSegundaIzq2 = new Transform3D();
        Transform3D t3dGirarVentanaSegundaIzqY = new Transform3D();
        t3dGirarVentanaSegundaIzqY.rotY(Math.PI / 180 * 45);
        t3dVentanaSegundaIzq2.set(new Vector3f(0.03f, 0.03f, 0.026f));
        t3dVentanaSegundaIzq2.mul(t3dGirarVentanaSegundaIzqY);
        TransformGroup tgVentanaSegundaIzq2 = new TransformGroup(t3dVentanaSegundaIzq2);
        tgVentanaSegundaIzq2.addChild(bxventanaIzqTor2);
        tgTorreIzq4.addChild(tgVentanaSegundaIzq2);
        //2 Cristal de Ventanas Izquierda 2
        Transform3D t3dCristalSegundaIzq2 = new Transform3D();
        t3dCristalSegundaIzq2.set(new Vector3f(0.0f, 0.0f, 0.0055f));
        TransformGroup tgCristalSegundaIzq2 = new TransformGroup(t3dCristalSegundaIzq2);
        tgCristalSegundaIzq2.addChild(bxcristalIzqTor2);
        tgVentanaSegundaIzq2.addChild(tgCristalSegundaIzq2);
        //Ventana torre 2 Izquierda 3
        Transform3D t3dVentanaSegundaIzq3 = new Transform3D();
        Transform3D t3dGirarVentanaSegundaIzq2Y = new Transform3D();
        t3dGirarVentanaSegundaIzq2Y.rotY(Math.PI / 180 * 315);
        t3dVentanaSegundaIzq3.set(new Vector3f(-0.03f, 0.03f, 0.026f));
        t3dVentanaSegundaIzq3.mul(t3dGirarVentanaSegundaIzq2Y);
        TransformGroup tgVentanaSegundaIzq3 = new TransformGroup(t3dVentanaSegundaIzq3);
        tgVentanaSegundaIzq3.addChild(bxventanaIzqTor3);
        tgTorreIzq4.addChild(tgVentanaSegundaIzq3);
        //2 Cristal de Ventanas Izquierda 3
        Transform3D t3dCristalSegundaIzq3 = new Transform3D();
        t3dCristalSegundaIzq3.set(new Vector3f(0.0f, 0.0f, 0.0055f));
        TransformGroup tgCristalSegundaIzq3 = new TransformGroup(t3dCristalSegundaIzq3);
        tgCristalSegundaIzq3.addChild(bxcristalIzqTor3);
        tgVentanaSegundaIzq3.addChild(tgCristalSegundaIzq3);
        
        
        torre.addChild(tgTorreIzq);
        return torre;
    }
    
    public void abrir() {
        Transform3D leerInfoDer = new Transform3D();
        Transform3D confInfoDer = new Transform3D();
        tgBisagraDer.getTransform(leerInfoDer);
        Transform3D leerInfoIzq = new Transform3D();
        Transform3D confInfoIzq = new Transform3D();
        tgBisagraIzq.getTransform(leerInfoIzq);
        if (contador < 10) {
            confInfoDer.rotY(Math.PI / 180 * 9);
            leerInfoDer.mul(confInfoDer);
            confInfoIzq.rotY(Math.PI / 180 * -9);
            leerInfoIzq.mul(confInfoIzq);
        } 
        tgBisagraDer.setTransform(leerInfoDer);
        tgBisagraIzq.setTransform(leerInfoIzq);
        contador++;
    }
    
    public void mover() {
        Transform3D leerInfoBuro = new Transform3D();
        Transform3D confInfoBuro = new Transform3D();
        tgBurosp.getTransform(leerInfoBuro);
        Transform3D leerInfoSilla = new Transform3D();
        Transform3D confInfoSilla = new Transform3D();
        tgSilla.getTransform(leerInfoSilla);
        Transform3D leerInfo2Silla = new Transform3D();
        Transform3D confInfo2Silla = new Transform3D();
        tg2Silla.getTransform(leerInfo2Silla);
        Transform3D leerInfo3Silla = new Transform3D();
        Transform3D confInfo3Silla = new Transform3D();
        tg3Silla.getTransform(leerInfo3Silla);
        Transform3D leerInfo4Silla = new Transform3D();
        Transform3D confInfo4Silla = new Transform3D();
        tg4Silla.getTransform(leerInfo4Silla);
        Transform3D leerInfo5Silla = new Transform3D();
        Transform3D confInfo5Silla = new Transform3D();
        tg5Silla.getTransform(leerInfo5Silla);
        Transform3D leerInfo6Silla = new Transform3D();
        Transform3D confInfo6Silla = new Transform3D();
        tg6Silla.getTransform(leerInfo6Silla);
        Transform3D leerInfo7Silla = new Transform3D();
        Transform3D confInfo7Silla = new Transform3D();
        tg7Silla.getTransform(leerInfo7Silla);
        Transform3D leerInfo8Silla = new Transform3D();
        Transform3D confInfo8Silla = new Transform3D();
        tg8Silla.getTransform(leerInfo8Silla);
        Transform3D leerInfo9Silla = new Transform3D();
        Transform3D confInfo9Silla = new Transform3D();
        tg9Silla.getTransform(leerInfo9Silla);
        Transform3D leerInfo10Silla = new Transform3D();
        Transform3D confInfo10Silla = new Transform3D();
        tg10Silla.getTransform(leerInfo10Silla);        
        if (contador2 < 10) {
            confInfoBuro.rotY(Math.PI / 180 * -2.5);
            leerInfoBuro.mul(confInfoBuro);
            confInfoSilla.rotY(Math.PI / 180 * 2.5);
            leerInfoSilla.mul(confInfoSilla);
            confInfo2Silla.rotY(Math.PI / 180 * 2.5);
            leerInfo2Silla.mul(confInfo2Silla);
            confInfo3Silla.rotY(Math.PI / 180 * 2.5);
            leerInfo3Silla.mul(confInfo3Silla);
            confInfo4Silla.rotY(Math.PI / 180 * 2.5);
            leerInfo4Silla.mul(confInfo4Silla);
            confInfo5Silla.rotY(Math.PI / 180 * 2.5);
            leerInfo5Silla.mul(confInfo5Silla);
            confInfo6Silla.rotY(Math.PI / 180 * -2.5);
            leerInfo6Silla.mul(confInfo6Silla);
            confInfo7Silla.rotY(Math.PI / 180 * -2.5);
            leerInfo7Silla.mul(confInfo7Silla);
            confInfo8Silla.rotY(Math.PI / 180 * -2.5);
            leerInfo8Silla.mul(confInfo8Silla);
            confInfo9Silla.rotY(Math.PI / 180 * -2.5);
            leerInfo9Silla.mul(confInfo9Silla);
            confInfo10Silla.rotY(Math.PI / 180 * -2.5);
            leerInfo10Silla.mul(confInfo10Silla);
            } else {
            if (contador2 < 20) {
             confInfoBuro.rotY(Math.PI / 180 * 2.5);
            leerInfoBuro.mul(confInfoBuro);
            confInfoSilla.rotY(Math.PI / 180 * -2.5);
            leerInfoSilla.mul(confInfoSilla);
            confInfo2Silla.rotY(Math.PI / 180 * -2.5);
            leerInfo2Silla.mul(confInfo2Silla);
            confInfo3Silla.rotY(Math.PI / 180 * -2.5);
            leerInfo3Silla.mul(confInfo3Silla);
            confInfo4Silla.rotY(Math.PI / 180 * -2.5);
            leerInfo4Silla.mul(confInfo4Silla);
            confInfo5Silla.rotY(Math.PI / 180 * -2.5);
            leerInfo5Silla.mul(confInfo5Silla);
            confInfo6Silla.rotY(Math.PI / 180 * 2.5);
            leerInfo6Silla.mul(confInfo6Silla);
            confInfo7Silla.rotY(Math.PI / 180 * 2.5);
            leerInfo7Silla.mul(confInfo7Silla);
            confInfo8Silla.rotY(Math.PI / 180 * 2.5);
            leerInfo8Silla.mul(confInfo8Silla);
            confInfo9Silla.rotY(Math.PI / 180 * 2.5);
            leerInfo9Silla.mul(confInfo9Silla);
            confInfo10Silla.rotY(Math.PI / 180 * 2.5);
            leerInfo10Silla.mul(confInfo10Silla);               
            }else{
            contador2 = -1;
            }
        } 
        tgBurosp.setTransform(leerInfoBuro);
        tgSilla.setTransform(leerInfoSilla);
        tg2Silla.setTransform(leerInfo2Silla);
        tg3Silla.setTransform(leerInfo3Silla);
        tg4Silla.setTransform(leerInfo4Silla);
        tg5Silla.setTransform(leerInfo5Silla);
        tg6Silla.setTransform(leerInfo6Silla);
        tg7Silla.setTransform(leerInfo7Silla);
        tg8Silla.setTransform(leerInfo8Silla);
        tg9Silla.setTransform(leerInfo9Silla);
        tg10Silla.setTransform(leerInfo10Silla);
        contador2++;
    }
}
