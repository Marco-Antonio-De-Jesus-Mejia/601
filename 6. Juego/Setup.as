package  {
	import flash.display.MovieClip;
	import flash.events.Event;
	import flash.sampler.NewObjectSample;
	
	public class Setup extends MovieClip{

        private var Fondo_new: FONDOFN = new FONDOFN;
		private var Thor_new: THORFN = new THORFN;
		static var Loki_new: LOKIFNL = new LOKIFNL;
		static var puntos_contador_new : puntos_contador = new puntos_contador();
		static var puntos : Number = 0;
		//private var Rayo_new: RAYO = new RAYO;
		
		public function Setup() {
			//constructor
			addChild(Fondo_new);
			addChild(Thor_new);
			addChild(Loki_new);
			addChild(puntos_contador_new);
			//addChild(Rayo_new);
			Fondo_new.x=-20, Fondo_new.y=-30;
			Thor_new.x=235, Thor_new.y=0;
			Loki_new.x=235, Loki_new.y=320;
		    //Rayo_new.x=235, Rayo_new.y=200;
			puntos_contador_new.x=10, puntos_contador_new.y=10;
			puntos_contador_new.puntos_txt.text = String(puntos);
			this.addEventListener(Event.ENTER_FRAME, actualiza_punto);
		}
		
		function actualiza_punto(e:Event){
				puntos_contador_new.puntos_txt.text = String(puntos);
		}
	
	}
	
}
