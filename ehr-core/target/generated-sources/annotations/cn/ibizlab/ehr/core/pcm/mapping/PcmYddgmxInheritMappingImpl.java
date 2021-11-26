package cn.ibizlab.ehr.core.pcm.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmYddgmx;
import cn.ibizlab.ehr.core.pcm.domain.PcmYdmx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-18T11:09:13+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmYddgmxInheritMappingImpl implements PcmYddgmxInheritMapping {

    @Override
    public PcmYdmx toPcmydmx(PcmYddgmx pcmyddgmx) {
        if ( pcmyddgmx == null ) {
            return null;
        }

        PcmYdmx pcmYdmx = new PcmYdmx();

        pcmYdmx.setPcmydmxid( pcmyddgmx.getPcmyddgmxid() );
        pcmYdmx.setPcmydmxname( pcmyddgmx.getPcmyddgmxname() );
        Map<String, Object> map = pcmyddgmx.getExtensionparams();
        if ( map != null ) {
            pcmYdmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        pcmYdmx.setYzw( pcmyddgmx.getYzw() );
        pcmYdmx.setPcmydmxtype( pcmyddgmx.getPcmydmxtype() );
        pcmYdmx.setYrank( pcmyddgmx.getYrank() );
        pcmYdmx.setSxrq( pcmyddgmx.getSxrq() );
        pcmYdmx.setCheckstatus( pcmyddgmx.getCheckstatus() );
        pcmYdmx.setYgw( pcmyddgmx.getYgw() );
        pcmYdmx.setYgbh( pcmyddgmx.getYgbh() );
        pcmYdmx.setZjhm( pcmyddgmx.getZjhm() );
        pcmYdmx.setZz( pcmyddgmx.getZz() );
        pcmYdmx.setCsrq( pcmyddgmx.getCsrq() );
        pcmYdmx.setLxdh( pcmyddgmx.getLxdh() );
        pcmYdmx.setNl( pcmyddgmx.getNl() );
        pcmYdmx.setBm( pcmyddgmx.getBm() );
        pcmYdmx.setPimpersonid( pcmyddgmx.getPimpersonid() );
        pcmYdmx.setZzid( pcmyddgmx.getZzid() );
        pcmYdmx.setBmid( pcmyddgmx.getBmid() );
        pcmYdmx.setCreatedate( pcmyddgmx.getCreatedate() );
        pcmYdmx.setCreateman( pcmyddgmx.getCreateman() );
        pcmYdmx.setUpdatedate( pcmyddgmx.getUpdatedate() );
        pcmYdmx.setUpdateman( pcmyddgmx.getUpdateman() );
        pcmYdmx.setPimpersonname( pcmyddgmx.getPimpersonname() );
        pcmYdmx.setZzdzs( pcmyddgmx.getZzdzs() );
        pcmYdmx.setShortname( pcmyddgmx.getShortname() );

        return pcmYdmx;
    }

    @Override
    public PcmYddgmx toPcmyddgmx(PcmYdmx pcmydmx) {
        if ( pcmydmx == null ) {
            return null;
        }

        PcmYddgmx pcmYddgmx = new PcmYddgmx();

        pcmYddgmx.setPcmyddgmxname( pcmydmx.getPcmydmxname() );
        pcmYddgmx.setPcmyddgmxid( pcmydmx.getPcmydmxid() );
        Map<String, Object> map = pcmydmx.getExtensionparams();
        if ( map != null ) {
            pcmYddgmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        pcmYddgmx.setSxrq( pcmydmx.getSxrq() );
        pcmYddgmx.setBmid( pcmydmx.getBmid() );
        pcmYddgmx.setZz( pcmydmx.getZz() );
        pcmYddgmx.setYrank( pcmydmx.getYrank() );
        pcmYddgmx.setPimpersonid( pcmydmx.getPimpersonid() );
        pcmYddgmx.setZjhm( pcmydmx.getZjhm() );
        pcmYddgmx.setCreatedate( pcmydmx.getCreatedate() );
        pcmYddgmx.setYgw( pcmydmx.getYgw() );
        pcmYddgmx.setUpdatedate( pcmydmx.getUpdatedate() );
        pcmYddgmx.setCsrq( pcmydmx.getCsrq() );
        pcmYddgmx.setLxdh( pcmydmx.getLxdh() );
        pcmYddgmx.setCreateman( pcmydmx.getCreateman() );
        pcmYddgmx.setYzw( pcmydmx.getYzw() );
        pcmYddgmx.setShortname( pcmydmx.getShortname() );
        pcmYddgmx.setYgbh( pcmydmx.getYgbh() );
        pcmYddgmx.setNl( pcmydmx.getNl() );
        pcmYddgmx.setCheckstatus( pcmydmx.getCheckstatus() );
        pcmYddgmx.setPimpersonname( pcmydmx.getPimpersonname() );
        pcmYddgmx.setZzdzs( pcmydmx.getZzdzs() );
        pcmYddgmx.setBm( pcmydmx.getBm() );
        pcmYddgmx.setZzid( pcmydmx.getZzid() );
        pcmYddgmx.setPcmydmxtype( pcmydmx.getPcmydmxtype() );
        pcmYddgmx.setUpdateman( pcmydmx.getUpdateman() );

        return pcmYddgmx;
    }

    @Override
    public List<PcmYdmx> toPcmydmx(List<PcmYddgmx> pcmyddgmx) {
        if ( pcmyddgmx == null ) {
            return null;
        }

        List<PcmYdmx> list = new ArrayList<PcmYdmx>( pcmyddgmx.size() );
        for ( PcmYddgmx pcmYddgmx : pcmyddgmx ) {
            list.add( toPcmydmx( pcmYddgmx ) );
        }

        return list;
    }

    @Override
    public List<PcmYddgmx> toPcmyddgmx(List<PcmYdmx> pcmydmx) {
        if ( pcmydmx == null ) {
            return null;
        }

        List<PcmYddgmx> list = new ArrayList<PcmYddgmx>( pcmydmx.size() );
        for ( PcmYdmx pcmYdmx : pcmydmx ) {
            list.add( toPcmyddgmx( pcmYdmx ) );
        }

        return list;
    }
}
