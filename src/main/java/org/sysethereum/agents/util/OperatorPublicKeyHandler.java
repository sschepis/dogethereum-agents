package org.sysethereum.agents.util;

import org.bitcoinj.core.Address;
import org.bitcoinj.script.Script;

/**
 * Exposes Operator public key related information
 */

public interface OperatorPublicKeyHandler {
    Script getOutputScript();

    Address getAddress();

    byte[] getPublicKeyHash();

    /**
     * Returns address creation time expressed in seconds since the epoch.
     */
    long getAddressCreationTime();
}
