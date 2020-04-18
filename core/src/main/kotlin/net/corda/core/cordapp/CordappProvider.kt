package net.corda.core.cordapp


import net.corda.core.DoNotImplement

/**
 * Provides access to what the node knows about loaded applications.
 */
@DoNotImplement

interface CordappProvider {
    /**
     * Exposes the current CorDapp context which will contain information and configuration of the CorDapp that
     * is currently running.
     *
     * The calling application is found via stack walking and finding the first class on the stack that matches any class
     * contained within the automatically resolved [Cordapp]s loaded by the [CordappLoader]
     *
     * @throws IllegalStateException When called from a non-app context
     */
    fun getAppContext(): CordappContext
}