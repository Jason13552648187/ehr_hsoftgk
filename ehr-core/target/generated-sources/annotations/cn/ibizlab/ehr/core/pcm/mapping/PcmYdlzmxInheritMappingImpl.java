package cn.ibizlab.ehr.core.pcm.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmYdlzmx;
import cn.ibizlab.ehr.core.pcm.domain.PcmYdmx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-18T11:09:12+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmYdlzmxInheritMappingImpl implements PcmYdlzmxInheritMapping {

    @Override
    public PcmYdmx toPcmydmx(PcmYdlzmx pcmydlzmx) {
        if ( pcmydlzmx == null ) {
            return null;
        }

        PcmYdmx pcmYdmx = new PcmYdmx();

        pcmYdmx.setPcmydmxid( pcmydlzmx.getPcmydlzmxid() );
        pcmYdmx.setPcmydmxname( pcmydlzmx.getPcmydlzmxname() );
        Map<String, Object> map = pcmydlzmx.getExtensionparams();
        if ( map != null ) {
            pcmYdmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        pcmYdmx.setYzw( pcmydlzmx.getYzw() );
        pcmYdmx.setPcmydmxtype( pcmydlzmx.getPcmydmxtype() );
        pcmYdmx.setYrank( pcmydlzmx.getYrank() );
        pcmYdmx.setSxrq( pcmydlzmx.getSxrq() );
        pcmYdmx.setCheckstatus( pcmydlzmx.getCheckstatus() );
        pcmYdmx.setYgw( pcmydlzmx.getYgw() );
        pcmYdmx.setYgbh( pcmydlzmx.getYgbh() );
        pcmYdmx.setZjhm( pcmydlzmx.getZjhm() );
        pcmYdmx.setZz( pcmydlzmx.getZz() );
        pcmYdmx.setCsrq( pcmydlzmx.getCsrq() );
        pcmYdmx.setLxdh( pcmydlzmx.getLxdh() );
        pcmYdmx.setNl( pcmydlzmx.getNl() );
        pcmYdmx.setBm( pcmydlzmx.getBm() );
        pcmYdmx.setPimpersonid( pcmydlzmx.getPimpersonid() );
        pcmYdmx.setZzid( pcmydlzmx.getZzid() );
        pcmYdmx.setBmid( pcmydlzmx.getBmid() );
        pcmYdmx.setCreatedate( pcmydlzmx.getCreatedate() );
        pcmYdmx.setCreateman( pcmydlzmx.getCreateman() );
        pcmYdmx.setUpdatedate( pcmydlzmx.getUpdatedate() );
        pcmYdmx.setUpdateman( pcmydlzmx.getUpdateman() );
        pcmYdmx.setPimpersonname( pcmydlzmx.getPimpersonname() );
        pcmYdmx.setZzdzs( pcmydlzmx.getZzdzs() );
        pcmYdmx.setShortname( pcmydlzmx.getShortname() );

        return pcmYdmx;
    }

    @Override
    public PcmYdlzmx toPcmydlzmx(PcmYdmx pcmydmx) {
        if ( pcmydmx == null ) {
            return null;
        }

        PcmYdlzmx pcmYdlzmx = new PcmYdlzmx();

        pcmYdlzmx.setPcmydlzmxid( pcmydmx.getPcmydmxid() );
        pcmYdlzmx.setPcmydlzmxname( pcmydmx.getPcmydmxname() );
        Map<String, Object> map = pcmydmx.getExtensionparams();
        if ( map != null ) {
            pcmYdlzmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        pcmYdlzmx.setNl( pcmydmx.getNl() );
        pcmYdlzmx.setCheckstatus( pcmydmx.getCheckstatus() );
        pcmYdlzmx.setZzid( pcmydmx.getZzid() );
        pcmYdlzmx.setYrank( pcmydmx.getYrank() );
        pcmYdlzmx.setLxdh( pcmydmx.getLxdh() );
        pcmYdlzmx.setPimpersonid( pcmydmx.getPimpersonid() );
        pcmYdlzmx.setBm( pcmydmx.getBm() );
        pcmYdlzmx.setZzdzs( pcmydmx.getZzdzs() );
        pcmYdlzmx.setShortname( pcmydmx.getShortname() );
        pcmYdlzmx.setYgbh( pcmydmx.getYgbh() );
        pcmYdlzmx.setCreateman( pcmydmx.getCreateman() );
        pcmYdlzmx.setZjhm( pcmydmx.getZjhm() );
        pcmYdlzmx.setSxrq( pcmydmx.getSxrq() );
        pcmYdlzmx.setPimpersonname( pcmydmx.getPimpersonname() );
        pcmYdlzmx.setBmid( pcmydmx.getBmid() );
        pcmYdlzmx.setUpdateman( pcmydmx.getUpdateman() );
        pcmYdlzmx.setCreatedate( pcmydmx.getCreatedate() );
        pcmYdlzmx.setPcmydmxtype( pcmydmx.getPcmydmxtype() );
        pcmYdlzmx.setYzw( pcmydmx.getYzw() );
        pcmYdlzmx.setCsrq( pcmydmx.getCsrq() );
        pcmYdlzmx.setYgw( pcmydmx.getYgw() );
        pcmYdlzmx.setZz( pcmydmx.getZz() );
        pcmYdlzmx.setUpdatedate( pcmydmx.getUpdatedate() );

        return pcmYdlzmx;
    }

    @Override
    public List<PcmYdmx> toPcmydmx(List<PcmYdlzmx> pcmydlzmx) {
        if ( pcmydlzmx == null ) {
            return null;
        }

        List<PcmYdmx> list = new ArrayList<PcmYdmx>( pcmydlzmx.size() );
        for ( PcmYdlzmx pcmYdlzmx : pcmydlzmx ) {
            list.add( toPcmydmx( pcmYdlzmx ) );
        }

        return list;
    }

    @Override
    public List<PcmYdlzmx> toPcmydlzmx(List<PcmYdmx> pcmydmx) {
        if ( pcmydmx == null ) {
            return null;
        }

        List<PcmYdlzmx> list = new ArrayList<PcmYdlzmx>( pcmydmx.size() );
        for ( PcmYdmx pcmYdmx : pcmydmx ) {
            list.add( toPcmydlzmx( pcmYdmx ) );
        }

        return list;
    }
}
