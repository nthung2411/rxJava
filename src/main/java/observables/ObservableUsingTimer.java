/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observables;

import io.reactivex.Observable;
import java.util.concurrent.TimeUnit;
import observers.DemoObserver;

/**
 *
 * @author nthung01
 */
public class ObservableUsingTimer {

    public static void main(String... args) throws InterruptedException {
        Observable.timer(3, TimeUnit.SECONDS).subscribe(new DemoObserver(1L));
        Thread.sleep(4000);
    }
}
