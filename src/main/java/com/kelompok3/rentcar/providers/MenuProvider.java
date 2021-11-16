package com.kelompok3.rentcar.providers;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import com.kelompok3.rentcar.models.Menu;
import com.kelompok3.rentcar.services.Pengaturan;
import com.kelompok3.rentcar.services.Pengembalian;
import com.kelompok3.rentcar.services.Penyewaan;
import com.kelompok3.rentcar.services.Welcome;
import com.kelompok3.rentcar.services.misc.Print;

public class MenuProvider {
    List<Menu> menu= new ArrayList<>();
    private Method declaredMethod;

    public MenuProvider(List<Menu> menu){
        this.menu = menu;
    }

    public MenuProvider() {
    }

    public void setMenu(){
        this.menu = new MenuList().registerMenu();
    }

    public List<Menu> getMenu() {
        this.menu = new MenuList().registerMenu();
        return this.menu;
    }

    public void runMenu(int index){
        Menu selectedMenu = this.menu.get(index);
        Class<Object> selectedClass = (Class<Object>) selectedMenu.getmainClass();
        try {
            // new Print(obj.getClass().getName()).line();
            declaredMethod = selectedClass.getDeclaredMethod("mainRun");
            // method = declaredMethod;
            declaredMethod.invoke(selectedClass.getClass());
          } catch (SecurityException e) { new Print(e.toString()).nextLine(); }
            catch (NoSuchMethodException e) { new Print(e.toString()).nextLine(); }
            catch (IllegalArgumentException e) { new Print(e.toString()).nextLine(); }
            catch (IllegalAccessException e) { new Print(e.toString()).nextLine(); }
            catch (InvocationTargetException e) {
                final Throwable cause = e.getCause();
                 new Print(cause.toString()).nextLine(); 
            }
    }
}

class MenuList {

    public List<Menu> registerMenu(){
        List<Menu> menu = new ArrayList<>();
        menu.add(new Menu(1, "Home", Welcome.class));
        menu.add(new Menu(2, "Penyewaan", Penyewaan.class));
        menu.add(new Menu(3, "Pengembalian", Pengembalian.class));
        menu.add(new Menu(4, "Pengaturan Akun", Pengaturan.class));

        return menu;
    }
}
