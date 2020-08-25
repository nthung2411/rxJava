/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observables;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import observers.DemoObserver;

/**
 *
 * @author nthung01
 */
public class ObservableUsingCreate {
    public static void main(String... args) {
       Observable<Object> observableUsingCreate = Observable.create(new ObservableOnSubscribe<Object>(){
            @Override
            public void subscribe(ObservableEmitter<Object> oe) throws Exception {
                try{
                    oe.onNext(1);
                }catch(Exception ex){
                    oe.onError(ex);
                }
                //oe.onComplete();
            }
        });

        observableUsingCreate.subscribe(new DemoObserver(1L));
        
        observableUsingCreate.subscribe(new DemoObserver(2L));
    }
}
