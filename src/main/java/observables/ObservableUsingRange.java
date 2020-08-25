/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observables;

import io.reactivex.Observable;
import observers.DemoObserver;

/**
 *
 * @author nthung01
 */
public class ObservableUsingRange {
    public static void main(String... args) throws InterruptedException {
        Observable.range(2, 20).subscribe(new DemoObserver(1L));
    }
    
}
