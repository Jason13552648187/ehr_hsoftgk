package cn.ibizlab.ehr.core.pcm.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmYdmx;
import cn.ibizlab.ehr.core.pcm.domain.PcmYdntmx;
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
public class PcmYdntmxInheritMappingImpl implements PcmYdntmxInheritMapping {

    @Override
    public PcmYdmx toPcmydmx(PcmYdntmx pcmydntmx) {
        if ( pcmydntmx == null ) {
            return null;
        }

        PcmYdmx pcmYdmx = new PcmYdmx();

        pcmYdmx.setPcmydmxid( pcmydntmx.getPcmydntmxid() );
        pcmYdmx.setPcmydmxname( pcmydntmx.getPcmydntmxname() );
        Map<String, Object> map = pcmydntmx.getExtensionparams();
        if ( map != null ) {
            pcmYdmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        pcmYdmx.setYzw( pcmydntmx.getYzw() );
        pcmYdmx.setPcmydmxtype( pcmydntmx.getPcmydmxtype() );
        pcmYdmx.setYrank( pcmydntmx.getYrank() );
        pcmYdmx.setSxrq( pcmydntmx.getSxrq() );
        pcmYdmx.setCheckstatus( pcmydntmx.getCheckstatus() );
        pcmYdmx.setYgw( pcmydntmx.getYgw() );
        pcmYdmx.setYgbh( pcmydntmx.getYgbh() );
        pcmYdmx.setZjhm( pcmydntmx.getZjhm() );
        pcmYdmx.setZz( pcmydntmx.getZz() );
        pcmYdmx.setCsrq( pcmydntmx.getCsrq() );
        pcmYdmx.setLxdh( pcmydntmx.getLxdh() );
        pcmYdmx.setNl( pcmydntmx.getNl() );
        pcmYdmx.setBm( pcmydntmx.getBm() );
        pcmYdmx.setPimpersonid( pcmydntmx.getPimpersonid() );
        pcmYdmx.setZzid( pcmydntmx.getZzid() );
        pcmYdmx.setBmid( pcmydntmx.getBmid() );
        pcmYdmx.setCreatedate( pcmydntmx.getCreatedate() );
        pcmYdmx.setCreateman( pcmydntmx.getCreateman() );
        pcmYdmx.setUpdatedate( pcmydntmx.getUpdatedate() );
        pcmYdmx.setUpdateman( pcmydntmx.getUpdateman() );
        pcmYdmx.setPimpersonname( pcmydntmx.getPimpersonname() );
        pcmYdmx.setZzdzs( pcmydntmx.getZzdzs() );
        pcmYdmx.setShortname( pcmydntmx.getShortname() );

        return pcmYdmx;
    }

    @Override
    public PcmYdntmx toPcmydntmx(PcmYdmx pcmydmx) {
        if ( pcmydmx == null ) {
            return null;
        }

        PcmYdntmx pcmYdntmx = new PcmYdntmx();

        pcmYdntmx.setPcmydntmxid( pcmydmx.getPcmydmxid() );
        pcmYdntmx.setPcmydntmxname( pcmydmx.getPcmydmxname() );
        Map<String, Object> map = pcmydmx.getExtensionparams();
        if ( map != null ) {
            pcmYdntmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        pcmYdntmx.setZzdzs( pcmydmx.getZzdzs() );
        pcmYdntmx.setSxrq( pcmydmx.getSxrq() );
        pcmYdntmx.setBmid( pcmydmx.getBmid() );
        pcmYdntmx.setYzw( pcmydmx.getYzw() );
        pcmYdntmx.setUpdateman( pcmydmx.getUpdateman() );
        pcmYdntmx.setCreateman( pcmydmx.getCreateman() );
        pcmYdntmx.setCheckstatus( pcmydmx.getCheckstatus() );
        pcmYdntmx.setZzid( pcmydmx.getZzid() );
        pcmYdntmx.setLxdh( pcmydmx.getLxdh() );
        pcmYdntmx.setZjhm( pcmydmx.getZjhm() );
        pcmYdntmx.setYgbh( pcmydmx.getYgbh() );
        pcmYdntmx.setCreatedate( pcmydmx.getCreatedate() );
        pcmYdntmx.setPimpersonname( pcmydmx.getPimpersonname() );
        pcmYdntmx.setZz( pcmydmx.getZz() );
        pcmYdntmx.setPimpersonid( pcmydmx.getPimpersonid() );
        pcmYdntmx.setNl( pcmydmx.getNl() );
        pcmYdntmx.setYrank( pcmydmx.getYrank() );
        pcmYdntmx.setBm( pcmydmx.getBm() );
        pcmYdntmx.setPcmydmxtype( pcmydmx.getPcmydmxtype() );
        pcmYdntmx.setCsrq( pcmydmx.getCsrq() );
        pcmYdntmx.setUpdatedate( pcmydmx.getUpdatedate() );
        pcmYdntmx.setYgw( pcmydmx.getYgw() );
        pcmYdntmx.setShortname( pcmydmx.getShortname() );

        return pcmYdntmx;
    }

    @Override
    public List<PcmYdmx> toPcmydmx(List<PcmYdntmx> pcmydntmx) {
        if ( pcmydntmx == null ) {
            return null;
        }

        List<PcmYdmx> list = new ArrayList<PcmYdmx>( pcmydntmx.size() );
        for ( PcmYdntmx pcmYdntmx : pcmydntmx ) {
            list.add( toPcmydmx( pcmYdntmx ) );
        }

        return list;
    }

    @Override
    public List<PcmYdntmx> toPcmydntmx(List<PcmYdmx> pcmydmx) {
        if ( pcmydmx == null ) {
            return null;
        }

        List<PcmYdntmx> list = new ArrayList<PcmYdntmx>( pcmydmx.size() );
        for ( PcmYdmx pcmYdmx : pcmydmx ) {
            list.add( toPcmydntmx( pcmYdmx ) );
        }

        return list;
    }
}
