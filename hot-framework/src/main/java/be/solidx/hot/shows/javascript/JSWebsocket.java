package be.solidx.hot.shows.javascript;

import java.util.concurrent.ExecutorService;

import org.mozilla.javascript.NativeFunction;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.Scriptable;

import be.solidx.hot.Closure;
import be.solidx.hot.js.JSClosure;
import be.solidx.hot.shows.AbstractWebSocket;
import be.solidx.hot.shows.AbstractWebSocketHandler;
import be.solidx.hot.shows.WebSocket;

public class JSWebsocket extends AbstractWebSocket<NativeFunction, NativeObject> {

	Scriptable globalScope;
	
	public JSWebsocket(ExecutorService eventLoop, Scriptable globalScope) {
		super(eventLoop);
		this.globalScope = globalScope;
	}

	@Override
	protected Options buildOptions(NativeObject optionsMap) {
		return new Options((String) optionsMap.get(WebSocket.OPTION_PATH));
	}

	@Override
	protected AbstractWebSocketHandler<NativeFunction> buildHandler(ExecutorService	eventLoop) {
		return new JSHandler(eventLoop);
	}

	public class JSHandler extends AbstractWebSocketHandler<NativeFunction> {

		public JSHandler(ExecutorService eventLoop) {
			super(eventLoop);
		}
		
		@Override
		protected Closure buildClosure(NativeFunction closure) {
			return new JSClosure(closure, globalScope);
		}
	}
}