package pilot;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * An instance of this class will be created to activate the bundle
 */
public class Activator implements BundleActivator {

	/**
	 * @see BundleActivator#start(BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Hello, World!");
	}

	/**
	 * @see BundleActivator#stop(BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
	}

}
