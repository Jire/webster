package webster;

import samaritano.inject.AbstractModule;
import samaritano.inject.Provider;

public final class WebsterModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(Webster.class).to(SeleniumWebster.class);
		bind(WebsterProvider.of(Websters.basic())).to(Basic.class);
		bind(WebsterProvider.of(Websters.chrome())).to(Google.class);
		bind(WebsterProvider.of(Websters.firefox())).to(Firefox.class);
		bind(WebsterProvider.of(Websters.phantom())).to(Phantom.class);
	}

	private static final class WebsterProvider implements Provider<Webster> {

		private static WebsterProvider of(Webster webster) {
			return new WebsterProvider(webster);
		}

		private final Webster webster;

		private WebsterProvider(Webster webster) {
			this.webster = webster;
		}

		@Override
		public Webster provide() throws Exception {
			return webster;
		}

	}

}