/*
************************************************************************
*******************  CANADIAN ASTRONOMY DATA CENTRE  *******************
**************  CENTRE CANADIEN DE DONNÉES ASTRONOMIQUES  **************
*
*  (c) 2011.                            (c) 2011.
*  Government of Canada                 Gouvernement du Canada
*  National Research Council            Conseil national de recherches
*  Ottawa, Canada, K1A 0R6              Ottawa, Canada, K1A 0R6
*  All rights reserved                  Tous droits réservés
*
*  NRC disclaims any warranties,        Le CNRC dénie toute garantie
*  expressed, implied, or               énoncée, implicite ou légale,
*  statutory, of any kind with          de quelque nature que ce
*  respect to the software,             soit, concernant le logiciel,
*  including without limitation         y compris sans restriction
*  any warranty of merchantability      toute garantie de valeur
*  or fitness for a particular          marchande ou de pertinence
*  purpose. NRC shall not be            pour un usage particulier.
*  liable in any event for any          Le CNRC ne pourra en aucun cas
*  damages, whether direct or           être tenu responsable de tout
*  indirect, special or general,        dommage, direct ou indirect,
*  consequential or incidental,         particulier ou général,
*  arising from the use of the          accessoire ou fortuit, résultant
*  software.  Neither the name          de l'utilisation du logiciel. Ni
*  of the National Research             le nom du Conseil National de
*  Council of Canada nor the            Recherches du Canada ni les noms
*  names of its contributors may        de ses  participants ne peuvent
*  be used to endorse or promote        être utilisés pour approuver ou
*  products derived from this           promouvoir les produits dérivés
*  software without specific prior      de ce logiciel sans autorisation
*  written permission.                  préalable et particulière
*                                       par écrit.
*
*  This file is part of the             Ce fichier fait partie du projet
*  OpenCADC project.                    OpenCADC.
*
*  OpenCADC is free software:           OpenCADC est un logiciel libre ;
*  you can redistribute it and/or       vous pouvez le redistribuer ou le
*  modify it under the terms of         modifier suivant les termes de
*  the GNU Affero General Public        la “GNU Affero General Public
*  License as published by the          License” telle que publiée
*  Free Software Foundation,            par la Free Software Foundation
*  either version 3 of the              : soit la version 3 de cette
*  License, or (at your option)         licence, soit (à votre gré)
*  any later version.                   toute version ultérieure.
*
*  OpenCADC is distributed in the       OpenCADC est distribué
*  hope that it will be useful,         dans l’espoir qu’il vous
*  but WITHOUT ANY WARRANTY;            sera utile, mais SANS AUCUNE
*  without even the implied             GARANTIE : sans même la garantie
*  warranty of MERCHANTABILITY          implicite de COMMERCIALISABILITÉ
*  or FITNESS FOR A PARTICULAR          ni d’ADÉQUATION À UN OBJECTIF
*  PURPOSE.  See the GNU Affero         PARTICULIER. Consultez la Licence
*  General Public License for           Générale Publique GNU Affero
*  more details.                        pour plus de détails.
*
*  You should have received             Vous devriez avoir reçu une
*  a copy of the GNU Affero             copie de la Licence Générale
*  General Public License along         Publique GNU Affero avec
*  with OpenCADC.  If not, see          OpenCADC ; si ce n’est
*  <http://www.gnu.org/licenses/>.      pas le cas, consultez :
*                                       <http://www.gnu.org/licenses/>.
*
*  $Revision: 5 $
*
************************************************************************
*/

package ca.nrc.cadc.reg;

import java.net.URI;

/**
 * This class defines the constants for the strings that conform to the IVOA 
 * service standard identifiers.
 * 
 * @author yeunga
 */
public class Standards
{
	// name syntax: <base service>_<feature>_<major version><minor version>

    public final static String SIA_10 = "ivo://ivoa.net/std/SIA";
    public final static String SIA_QUERY_20 = "ivo://ivoa.net/std/SIA#query-2.0";

    public final static String SODA_SYNC_10 = "ivo://ivo.net/std/TAP#sync-1.0";
    public final static String SODA_ASYNC_10 = "ivo://ivo.net/std/TAP#async-1.0";

    public final static String AD_10 = "ivo://ivo.net/std/TAP";
    public final static String AD_SYNC_10 = "ivo://ivo.net/std/TAP#sync";
    public final static String AD_ASYNC_10 = "ivo://ivo.net/std/TAP#async";
    public final static String AD_TABLES_10 = "ivo://ivo.net/std/TAP#tables";

    public final static String CAT_10 = "ivo://ivo.net/std/TAP";
    public final static String CAT_SYNC_10 = "ivo://ivo.net/std/TAP#sync";
    public final static String CAT_ASYNC_10 = "ivo://ivo.net/std/TAP#async";
    public final static String CAT_TABLES_10 = "ivo://ivo.net/std/TAP#tables";

    public final static String TAP_10 = "ivo://ivo.net/std/TAP";
    public final static String TAP_SYNC_11 = "ivo://ivo.net/std/TAP#sync-1.1";
    public final static String TAP_ASYNC_11 = "ivo://ivo.net/std/TAP#async-1.1";
    public final static String TAP_TABLES_11 = "ivo://ivo.net/std/TAP#tables-1.1";

    public final static String VOSPACE = "ivo://ivoa.net/std/VOSpace/v2.0";
    public final static String VOSPACE_NODES_20 = "ivo://ivoa.net/std/VOSpace/v2.0#nodes";
    public final static String VOSPACE_SYNC_20 = "ivo://ivoa.net/std/VOSpace/v2.0#sync";
    public final static String VOSPACE_TRANSFERS_20 = "ivo://ivoa.net/std/VOSpace/v2.0#transfers";

    public final static String CRED_10 = "vos://cadc.nrc.ca~vospace/CADC/std/CRED";
    public final static String CRED_DELEGATE_10 = "vos://cadc.nrc.ca~vospace/CADC/std/CRED#delegate-1.0";
    public final static String CRED_PROXY_10 = "vos://cadc.nrc.ca~vospace/CADC/std/CRED#proxy-1.0";

    public final static String DATA_10 = "ivo://ivoa.net/std/DALI";
    public final static String CANFARDATA_10 = "vos://cadc.nrc.ca~vospace/CADC/std/CANFARDATA";

    public final static String CAOM2REPO_20 = "vos://cadc.nrc.ca~vospace/CADC/std/CAOM2REPO";
    public final static String CUTOUT_20 = "vos://cadc.nrc.ca~vospace/CADC/VOX#cutout";
    public final static String DATALINK_20 = "ivo://ivoa.net/std/DataLink#links-2.0";
    public final static String META_20 = "vos://cadc.nrc.ca~vospace/CADC/std/META";
    public final static String PKG_20 = "vos://cadc.nrc.ca~vospace/CADC/Std/Pkg#tar";

    public final static String PROC_10 = "vos://cadc.nrc.ca~vospace/CADC/std/PROC";
    public final static String VMOD_10 = "vos://cadc.nrc.ca~vospace/CADC/std/VMOD";

    public final static String GMS_10 = "vos://cadc.nrc.ca~vospace/CADC/Std/GMS";
    public final static String GMS_GROUPS_10 = "vos://cadc.nrc.ca~vospace/CADC/std/GMS#groups-1.0";
    public final static String GMS_SEARCH_10 = "vos://cadc.nrc.ca~vospace/CADC/std/GMS#search-1.0";

    public final static String UMS_USERS_10 = "vos://cadc.nrc.ca~vospace/CADC/std/UMS#users-1.0";
    public final static String UMS_REGS_10 = "vos://cadc.nrc.ca~vospace/CADC/std/UMS#regs-1.0";
    public final static String UMS_LOGIN_10 = "vos://cadc.nrc.ca~vospace/CADC/std/UMS#login-1.0";
    public final static String UMS_MODPASS_10 = "vos://cadc.nrc.ca~vospace/CADC/std/UMS#modpass-1.0";
    public final static String UMS_RESETPASS_10 = "vos://cadc.nrc.ca~vospace/CADC/std/UMS#resetpass-1.0";
    public final static String UMS_WHOAMI_10 = "vos://cadc.nrc.ca~vospace/CADC/std/UMS#whoami-1.0";
    
    /* URI corresponding to the above strings */
    public final static URI SIA_10_URI;
    public final static URI SIA_QUERY_20_URI;

    public final static URI SODA_SYNC_10_URI;
    public final static URI SODA_ASYNC_10_URI;

    public final static URI AD_10_URI;
    public final static URI AD_SYNC_10_URI;
    public final static URI AD_ASYNC_10_URI;
    public final static URI AD_TABLES_10_URI;

    public final static URI CAT_10_URI;
    public final static URI CAT_SYNC_10_URI;
    public final static URI CAT_ASYNC_10_URI;
    public final static URI CAT_TABLES_10_URI;

    public final static URI TAP_10_URI;
    public final static URI TAP_SYNC_11_URI;
    public final static URI TAP_ASYNC_11_URI;
    public final static URI TAP_TABLES_11_URI;

    public final static URI VOSPACE_URI;
    public final static URI VOSPACE_NODES_20_URI;
    public final static URI VOSPACE_SYNC_20_URI;
    public final static URI VOSPACE_TRANSFERS_20_URI;

    public final static URI CRED_10_URI;
    public final static URI CRED_DELEGATE_10_URI;
    public final static URI CRED_PROXY_10_URI;

    public final static URI DATA_10_URI;
    public final static URI CANFARDATA_10_URI;

    public final static URI CAOM2REPO_20_URI;
    public final static URI CUTOUT_20_URI;
    public final static URI DATALINK_20_URI;
    public final static URI META_20_URI;
    public final static URI PKG_20_URI;

    public final static URI PROC_10_URI;
    public final static URI VMOD_10_URI;

    public final static URI GMS_10_URI;
    public final static URI GMS_GROUPS_10_URI;
    public final static URI GMS_SEARCH_10_URI;

    public final static URI UMS_USERS_10_URI;
    public final static URI UMS_REGS_10_URI;
    public final static URI UMS_LOGIN_10_URI;
    public final static URI UMS_MODPASS_10_URI;
    public final static URI UMS_RESETPASS_10_URI;
    public final static URI UMS_WHOAMI_10_URI;
    
    static 
    {
        try 
        {
        	SIA_10_URI = URI.create(SIA_10);
        	SIA_QUERY_20_URI = URI.create(SIA_QUERY_20);
        	SODA_SYNC_10_URI = URI.create(SODA_SYNC_10);
        	SODA_ASYNC_10_URI = URI.create(SODA_ASYNC_10);
        	AD_10_URI = URI.create(AD_10);
        	AD_SYNC_10_URI = URI.create(AD_SYNC_10);
        	AD_ASYNC_10_URI = URI.create(AD_ASYNC_10);
        	AD_TABLES_10_URI = URI.create(AD_TABLES_10);
        	CAT_10_URI = URI.create(CAT_10);
        	CAT_SYNC_10_URI = URI.create(CAT_SYNC_10);
        	CAT_ASYNC_10_URI = URI.create(CAT_ASYNC_10);
        	CAT_TABLES_10_URI = URI.create(CAT_TABLES_10);
        	TAP_10_URI = URI.create(TAP_10);
        	TAP_SYNC_11_URI = URI.create(TAP_SYNC_11);
        	TAP_ASYNC_11_URI = URI.create(TAP_ASYNC_11);
        	TAP_TABLES_11_URI = URI.create(TAP_TABLES_11);
        	VOSPACE_URI = URI.create(VOSPACE);
            VOSPACE_NODES_20_URI = URI.create(VOSPACE_NODES_20);
            VOSPACE_SYNC_20_URI = URI.create(VOSPACE_SYNC_20);
            VOSPACE_TRANSFERS_20_URI = URI.create(VOSPACE_TRANSFERS_20);
            CRED_10_URI = URI.create(CRED_10);
            CRED_DELEGATE_10_URI = URI.create(CRED_DELEGATE_10);
            CRED_PROXY_10_URI = URI.create(CRED_PROXY_10);
            DATA_10_URI = URI.create(DATA_10);
            CANFARDATA_10_URI = URI.create(CANFARDATA_10);
            CAOM2REPO_20_URI = URI.create(CAOM2REPO_20);
            CUTOUT_20_URI = URI.create(CUTOUT_20);
            DATALINK_20_URI = URI.create(DATALINK_20);
            META_20_URI = URI.create(META_20);
            PKG_20_URI = URI.create(PKG_20);
            PROC_10_URI = URI.create(PROC_10);
            VMOD_10_URI = URI.create(VMOD_10);
            GMS_10_URI = URI.create(GMS_10);
            GMS_GROUPS_10_URI = URI.create(GMS_GROUPS_10);
            GMS_SEARCH_10_URI = URI.create(GMS_SEARCH_10);
            UMS_USERS_10_URI = URI.create(UMS_USERS_10);
            UMS_REGS_10_URI = URI.create(UMS_REGS_10);
            UMS_LOGIN_10_URI = URI.create(UMS_LOGIN_10);
            UMS_MODPASS_10_URI = URI.create(UMS_MODPASS_10);
            UMS_RESETPASS_10_URI = URI.create(UMS_RESETPASS_10);
            UMS_WHOAMI_10_URI = URI.create(UMS_WHOAMI_10);
        } 
        catch(IllegalArgumentException bug)
        {
            throw new RuntimeException("BUG: invalid URI string in static standard constants", bug);
        }
        catch(NullPointerException bug)
        {
            throw new RuntimeException("BUG: null URI string in static standard constants", bug);
        }
    }    
}
