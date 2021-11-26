package cn.ibizlab.ehr.core.pcm.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmYdjpmx;
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
public class PcmYdjpmxInheritMappingImpl implements PcmYdjpmxInheritMapping {

    @Override
    public PcmYdmx toPcmydmx(PcmYdjpmx pcmydjpmx) {
        if ( pcmydjpmx == null ) {
            return null;
        }

        PcmYdmx pcmYdmx = new PcmYdmx();

        pcmYdmx.setPcmydmxid( pcmydjpmx.getPcmydjpmxid() );
        pcmYdmx.setPcmydmxname( pcmydjpmx.getPcmydjpmxname() );
        Map<String, Object> map = pcmydjpmx.getExtensionparams();
        if ( map != null ) {
            pcmYdmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        pcmYdmx.setYzw( pcmydjpmx.getYzw() );
        pcmYdmx.setPcmydmxtype( pcmydjpmx.getPcmydmxtype() );
        pcmYdmx.setYrank( pcmydjpmx.getYrank() );
        pcmYdmx.setSxrq( pcmydjpmx.getSxrq() );
        pcmYdmx.setCheckstatus( pcmydjpmx.getCheckstatus() );
        pcmYdmx.setYgw( pcmydjpmx.getYgw() );
        pcmYdmx.setYgbh( pcmydjpmx.getYgbh() );
        pcmYdmx.setZjhm( pcmydjpmx.getZjhm() );
        pcmYdmx.setZz( pcmydjpmx.getZz() );
        pcmYdmx.setCsrq( pcmydjpmx.getCsrq() );
        pcmYdmx.setLxdh( pcmydjpmx.getLxdh() );
        pcmYdmx.setNl( pcmydjpmx.getNl() );
        pcmYdmx.setBm( pcmydjpmx.getBm() );
        pcmYdmx.setPimpersonid( pcmydjpmx.getPimpersonid() );
        pcmYdmx.setZzid( pcmydjpmx.getZzid() );
        pcmYdmx.setBmid( pcmydjpmx.getBmid() );
        pcmYdmx.setCreatedate( pcmydjpmx.getCreatedate() );
        pcmYdmx.setCreateman( pcmydjpmx.getCreateman() );
        pcmYdmx.setUpdatedate( pcmydjpmx.getUpdatedate() );
        pcmYdmx.setUpdateman( pcmydjpmx.getUpdateman() );
        pcmYdmx.setPimpersonname( pcmydjpmx.getPimpersonname() );
        pcmYdmx.setZzdzs( pcmydjpmx.getZzdzs() );
        pcmYdmx.setShortname( pcmydjpmx.getShortname() );

        return pcmYdmx;
    }

    @Override
    public PcmYdjpmx toPcmydjpmx(PcmYdmx pcmydmx) {
        if ( pcmydmx == null ) {
            return null;
        }

        PcmYdjpmx pcmYdjpmx = new PcmYdjpmx();

        pcmYdjpmx.setPcmydjpmxid( pcmydmx.getPcmydmxid() );
        pcmYdjpmx.setPcmydjpmxname( pcmydmx.getPcmydmxname() );
        Map<String, Object> map = pcmydmx.getExtensionparams();
        if ( map != null ) {
            pcmYdjpmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        pcmYdjpmx.setPcmydmxtype( pcmydmx.getPcmydmxtype() );
        pcmYdjpmx.setBmid( pcmydmx.getBmid() );
        pcmYdjpmx.setYgw( pcmydmx.getYgw() );
        pcmYdjpmx.setZzid( pcmydmx.getZzid() );
        pcmYdjpmx.setPimpersonid( pcmydmx.getPimpersonid() );
        pcmYdjpmx.setNl( pcmydmx.getNl() );
        pcmYdjpmx.setCreateman( pcmydmx.getCreateman() );
        pcmYdjpmx.setYgbh( pcmydmx.getYgbh() );
        pcmYdjpmx.setUpdateman( pcmydmx.getUpdateman() );
        pcmYdjpmx.setShortname( pcmydmx.getShortname() );
        pcmYdjpmx.setPimpersonname( pcmydmx.getPimpersonname() );
        pcmYdjpmx.setCreatedate( pcmydmx.getCreatedate() );
        pcmYdjpmx.setUpdatedate( pcmydmx.getUpdatedate() );
        pcmYdjpmx.setBm( pcmydmx.getBm() );
        pcmYdjpmx.setZz( pcmydmx.getZz() );
        pcmYdjpmx.setSxrq( pcmydmx.getSxrq() );
        pcmYdjpmx.setCheckstatus( pcmydmx.getCheckstatus() );
        pcmYdjpmx.setLxdh( pcmydmx.getLxdh() );
        pcmYdjpmx.setZzdzs( pcmydmx.getZzdzs() );
        pcmYdjpmx.setYrank( pcmydmx.getYrank() );
        pcmYdjpmx.setZjhm( pcmydmx.getZjhm() );
        pcmYdjpmx.setCsrq( pcmydmx.getCsrq() );
        pcmYdjpmx.setYzw( pcmydmx.getYzw() );

        return pcmYdjpmx;
    }

    @Override
    public List<PcmYdmx> toPcmydmx(List<PcmYdjpmx> pcmydjpmx) {
        if ( pcmydjpmx == null ) {
            return null;
        }

        List<PcmYdmx> list = new ArrayList<PcmYdmx>( pcmydjpmx.size() );
        for ( PcmYdjpmx pcmYdjpmx : pcmydjpmx ) {
            list.add( toPcmydmx( pcmYdjpmx ) );
        }

        return list;
    }

    @Override
    public List<PcmYdjpmx> toPcmydjpmx(List<PcmYdmx> pcmydmx) {
        if ( pcmydmx == null ) {
            return null;
        }

        List<PcmYdjpmx> list = new ArrayList<PcmYdjpmx>( pcmydmx.size() );
        for ( PcmYdmx pcmYdmx : pcmydmx ) {
            list.add( toPcmydjpmx( pcmYdmx ) );
        }

        return list;
    }
}
