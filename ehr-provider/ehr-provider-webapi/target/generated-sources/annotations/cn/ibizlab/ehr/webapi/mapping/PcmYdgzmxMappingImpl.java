package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmYdgzmx;
import cn.ibizlab.ehr.webapi.dto.PcmYdgzmxDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-04T00:31:48+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmYdgzmxMappingImpl implements PcmYdgzmxMapping {

    @Override
    public PcmYdgzmx toDomain(PcmYdgzmxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmYdgzmx pcmYdgzmx = new PcmYdgzmx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmYdgzmx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmYdgzmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getWbgw() != null ) {
            pcmYdgzmx.setWbgw( dto.getWbgw() );
        }
        if ( dto.getJsrq() != null ) {
            pcmYdgzmx.setJsrq( dto.getJsrq() );
        }
        if ( dto.getGztype() != null ) {
            pcmYdgzmx.setGztype( dto.getGztype() );
        }
        if ( dto.getWwzzid() != null ) {
            pcmYdgzmx.setWwzzid( dto.getWwzzid() );
        }
        if ( dto.getKsrq() != null ) {
            pcmYdgzmx.setKsrq( dto.getKsrq() );
        }
        if ( dto.getPcmydgzmxname() != null ) {
            pcmYdgzmx.setPcmydgzmxname( dto.getPcmydgzmxname() );
        }
        if ( dto.getCz() != null ) {
            pcmYdgzmx.setCz( dto.getCz() );
        }
        if ( dto.getPcmprofileid() != null ) {
            pcmYdgzmx.setPcmprofileid( dto.getPcmprofileid() );
        }
        if ( dto.getWbzz() != null ) {
            pcmYdgzmx.setWbzz( dto.getWbzz() );
        }
        if ( dto.getWbzw() != null ) {
            pcmYdgzmx.setWbzw( dto.getWbzw() );
        }
        if ( dto.getWbbm() != null ) {
            pcmYdgzmx.setWbbm( dto.getWbbm() );
        }
        if ( dto.getCheckstatus() != null ) {
            pcmYdgzmx.setCheckstatus( dto.getCheckstatus() );
        }
        if ( dto.getZzid() != null ) {
            pcmYdgzmx.setZzid( dto.getZzid() );
        }
        if ( dto.getSyyfColor() != null ) {
            pcmYdgzmx.setSyyfColor( dto.getSyyfColor() );
        }
        if ( dto.getPimpersonname() != null ) {
            pcmYdgzmx.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getBmid() != null ) {
            pcmYdgzmx.setBmid( dto.getBmid() );
        }
        if ( dto.getCsrq() != null ) {
            pcmYdgzmx.setCsrq( dto.getCsrq() );
        }
        if ( dto.getLxdh() != null ) {
            pcmYdgzmx.setLxdh( dto.getLxdh() );
        }
        if ( dto.getYrank() != null ) {
            pcmYdgzmx.setYrank( dto.getYrank() );
        }
        if ( dto.getOrgid() != null ) {
            pcmYdgzmx.setOrgid( dto.getOrgid() );
        }
        if ( dto.getZjhm() != null ) {
            pcmYdgzmx.setZjhm( dto.getZjhm() );
        }
        if ( dto.getSfdq() != null ) {
            pcmYdgzmx.setSfdq( dto.getSfdq() );
        }
        if ( dto.getPimpersonid() != null ) {
            pcmYdgzmx.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmYdgzmx.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getZzdzs() != null ) {
            pcmYdgzmx.setZzdzs( dto.getZzdzs() );
        }
        if ( dto.getCreateman() != null ) {
            pcmYdgzmx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getSxrq() != null ) {
            pcmYdgzmx.setSxrq( dto.getSxrq() );
        }
        if ( dto.getYgw() != null ) {
            pcmYdgzmx.setYgw( dto.getYgw() );
        }
        if ( dto.getFinished() != null ) {
            pcmYdgzmx.setFinished( dto.getFinished() );
        }
        if ( dto.getSyyf() != null ) {
            pcmYdgzmx.setSyyf( dto.getSyyf() );
        }
        if ( dto.getShortname() != null ) {
            pcmYdgzmx.setShortname( dto.getShortname() );
        }
        if ( dto.getPcmydgzmxid() != null ) {
            pcmYdgzmx.setPcmydgzmxid( dto.getPcmydgzmxid() );
        }
        if ( dto.getPcmydmxtype() != null ) {
            pcmYdgzmx.setPcmydmxtype( dto.getPcmydmxtype() );
        }
        if ( dto.getOrgsectorid() != null ) {
            pcmYdgzmx.setOrgsectorid( dto.getOrgsectorid() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmYdgzmx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getBm() != null ) {
            pcmYdgzmx.setBm( dto.getBm() );
        }
        if ( dto.getYgbh() != null ) {
            pcmYdgzmx.setYgbh( dto.getYgbh() );
        }
        if ( dto.getZz() != null ) {
            pcmYdgzmx.setZz( dto.getZz() );
        }
        if ( dto.getNl() != null ) {
            pcmYdgzmx.setNl( dto.getNl() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmYdgzmx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getYzw() != null ) {
            pcmYdgzmx.setYzw( dto.getYzw() );
        }

        return pcmYdgzmx;
    }

    @Override
    public PcmYdgzmxDTO toDto(PcmYdgzmx entity) {
        if ( entity == null ) {
            return null;
        }

        PcmYdgzmxDTO pcmYdgzmxDTO = new PcmYdgzmxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmYdgzmxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmYdgzmxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getWbgw() != null ) {
            pcmYdgzmxDTO.setWbgw( entity.getWbgw() );
        }
        if ( entity.getJsrq() != null ) {
            pcmYdgzmxDTO.setJsrq( entity.getJsrq() );
        }
        if ( entity.getGztype() != null ) {
            pcmYdgzmxDTO.setGztype( entity.getGztype() );
        }
        if ( entity.getWwzzid() != null ) {
            pcmYdgzmxDTO.setWwzzid( entity.getWwzzid() );
        }
        if ( entity.getKsrq() != null ) {
            pcmYdgzmxDTO.setKsrq( entity.getKsrq() );
        }
        if ( entity.getPcmydgzmxname() != null ) {
            pcmYdgzmxDTO.setPcmydgzmxname( entity.getPcmydgzmxname() );
        }
        if ( entity.getCz() != null ) {
            pcmYdgzmxDTO.setCz( entity.getCz() );
        }
        if ( entity.getPcmprofileid() != null ) {
            pcmYdgzmxDTO.setPcmprofileid( entity.getPcmprofileid() );
        }
        if ( entity.getWbzz() != null ) {
            pcmYdgzmxDTO.setWbzz( entity.getWbzz() );
        }
        if ( entity.getWbzw() != null ) {
            pcmYdgzmxDTO.setWbzw( entity.getWbzw() );
        }
        if ( entity.getWbbm() != null ) {
            pcmYdgzmxDTO.setWbbm( entity.getWbbm() );
        }
        if ( entity.getCheckstatus() != null ) {
            pcmYdgzmxDTO.setCheckstatus( entity.getCheckstatus() );
        }
        if ( entity.getZzid() != null ) {
            pcmYdgzmxDTO.setZzid( entity.getZzid() );
        }
        if ( entity.getSyyfColor() != null ) {
            pcmYdgzmxDTO.setSyyfColor( entity.getSyyfColor() );
        }
        if ( entity.getPimpersonname() != null ) {
            pcmYdgzmxDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getBmid() != null ) {
            pcmYdgzmxDTO.setBmid( entity.getBmid() );
        }
        if ( entity.getCsrq() != null ) {
            pcmYdgzmxDTO.setCsrq( entity.getCsrq() );
        }
        if ( entity.getLxdh() != null ) {
            pcmYdgzmxDTO.setLxdh( entity.getLxdh() );
        }
        if ( entity.getYrank() != null ) {
            pcmYdgzmxDTO.setYrank( entity.getYrank() );
        }
        if ( entity.getOrgid() != null ) {
            pcmYdgzmxDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getZjhm() != null ) {
            pcmYdgzmxDTO.setZjhm( entity.getZjhm() );
        }
        if ( entity.getSfdq() != null ) {
            pcmYdgzmxDTO.setSfdq( entity.getSfdq() );
        }
        if ( entity.getPimpersonid() != null ) {
            pcmYdgzmxDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmYdgzmxDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getZzdzs() != null ) {
            pcmYdgzmxDTO.setZzdzs( entity.getZzdzs() );
        }
        if ( entity.getCreateman() != null ) {
            pcmYdgzmxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getSxrq() != null ) {
            pcmYdgzmxDTO.setSxrq( entity.getSxrq() );
        }
        if ( entity.getYgw() != null ) {
            pcmYdgzmxDTO.setYgw( entity.getYgw() );
        }
        if ( entity.getFinished() != null ) {
            pcmYdgzmxDTO.setFinished( entity.getFinished() );
        }
        if ( entity.getSyyf() != null ) {
            pcmYdgzmxDTO.setSyyf( entity.getSyyf() );
        }
        if ( entity.getShortname() != null ) {
            pcmYdgzmxDTO.setShortname( entity.getShortname() );
        }
        if ( entity.getPcmydgzmxid() != null ) {
            pcmYdgzmxDTO.setPcmydgzmxid( entity.getPcmydgzmxid() );
        }
        if ( entity.getPcmydmxtype() != null ) {
            pcmYdgzmxDTO.setPcmydmxtype( entity.getPcmydmxtype() );
        }
        if ( entity.getOrgsectorid() != null ) {
            pcmYdgzmxDTO.setOrgsectorid( entity.getOrgsectorid() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmYdgzmxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getBm() != null ) {
            pcmYdgzmxDTO.setBm( entity.getBm() );
        }
        if ( entity.getYgbh() != null ) {
            pcmYdgzmxDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getZz() != null ) {
            pcmYdgzmxDTO.setZz( entity.getZz() );
        }
        if ( entity.getNl() != null ) {
            pcmYdgzmxDTO.setNl( entity.getNl() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmYdgzmxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getYzw() != null ) {
            pcmYdgzmxDTO.setYzw( entity.getYzw() );
        }

        return pcmYdgzmxDTO;
    }

    @Override
    public List<PcmYdgzmx> toDomain(List<PcmYdgzmxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmYdgzmx> list = new ArrayList<PcmYdgzmx>( dtoList.size() );
        for ( PcmYdgzmxDTO pcmYdgzmxDTO : dtoList ) {
            list.add( toDomain( pcmYdgzmxDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmYdgzmxDTO> toDto(List<PcmYdgzmx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmYdgzmxDTO> list = new ArrayList<PcmYdgzmxDTO>( entityList.size() );
        for ( PcmYdgzmx pcmYdgzmx : entityList ) {
            list.add( toDto( pcmYdgzmx ) );
        }

        return list;
    }
}
