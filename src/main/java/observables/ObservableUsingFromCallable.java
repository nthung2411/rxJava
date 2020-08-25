/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observables;

import io.reactivex.Observable;
import java.util.concurrent.Callable;
import observers.DemoObserver;

/**
 *
 * @author nthung01
 */
public class ObservableUsingFromCallable {

    public static void main(String... args) throws InterruptedException {
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(2000);
                return "Hello";
            }
        };

        Observable.fromCallable(callable)
                .subscribe(new DemoObserver(1L));
    }
}
