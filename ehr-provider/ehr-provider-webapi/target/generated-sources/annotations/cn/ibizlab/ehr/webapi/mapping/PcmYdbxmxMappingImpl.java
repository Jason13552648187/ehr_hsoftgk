package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmYdbxmx;
import cn.ibizlab.ehr.webapi.dto.PcmYdbxmxDTO;
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
    date = "2021-09-04T00:31:54+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmYdbxmxMappingImpl implements PcmYdbxmxMapping {

    @Override
    public PcmYdbxmx toDomain(PcmYdbxmxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmYdbxmx pcmYdbxmx = new PcmYdbxmx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmYdbxmx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmYdbxmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getBxyy() != null ) {
            pcmYdbxmx.setBxyy( dto.getBxyy() );
        }
        if ( dto.getPcmydbxmxname() != null ) {
            pcmYdbxmx.setPcmydbxmxname( dto.getPcmydbxmxname() );
        }
        if ( dto.getDistirbutionid() != null ) {
            pcmYdbxmx.setDistirbutionid( dto.getDistirbutionid() );
        }
        if ( dto.getBz() != null ) {
            pcmYdbxmx.setBz( dto.getBz() );
        }
        if ( dto.getCz() != null ) {
            pcmYdbxmx.setCz( dto.getCz() );
        }
        if ( dto.getJsrq() != null ) {
            pcmYdbxmx.setJsrq( dto.getJsrq() );
        }
        if ( dto.getIsfinished() != null ) {
            pcmYdbxmx.setIsfinished( dto.getIsfinished() );
        }
        if ( dto.getZjhm() != null ) {
            pcmYdbxmx.setZjhm( dto.getZjhm() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmYdbxmx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getYgbh() != null ) {
            pcmYdbxmx.setYgbh( dto.getYgbh() );
        }
        if ( dto.getYrank() != null ) {
            pcmYdbxmx.setYrank( dto.getYrank() );
        }
        if ( dto.getZzid() != null ) {
            pcmYdbxmx.setZzid( dto.getZzid() );
        }
        if ( dto.getYgw() != null ) {
            pcmYdbxmx.setYgw( dto.getYgw() );
        }
        if ( dto.getOrgsectorid() != null ) {
            pcmYdbxmx.setOrgsectorid( dto.getOrgsectorid() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmYdbxmx.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getLxdh() != null ) {
            pcmYdbxmx.setLxdh( dto.getLxdh() );
        }
        if ( dto.getBmid() != null ) {
            pcmYdbxmx.setBmid( dto.getBmid() );
        }
        if ( dto.getBm() != null ) {
            pcmYdbxmx.setBm( dto.getBm() );
        }
        if ( dto.getCheckstatus() != null ) {
            pcmYdbxmx.setCheckstatus( dto.getCheckstatus() );
        }
        if ( dto.getZzdzs() != null ) {
            pcmYdbxmx.setZzdzs( dto.getZzdzs() );
        }
        if ( dto.getPcmydmxtype() != null ) {
            pcmYdbxmx.setPcmydmxtype( dto.getPcmydmxtype() );
        }
        if ( dto.getCsrq() != null ) {
            pcmYdbxmx.setCsrq( dto.getCsrq() );
        }
        if ( dto.getCreateman() != null ) {
            pcmYdbxmx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getOrgid() != null ) {
            pcmYdbxmx.setOrgid( dto.getOrgid() );
        }
        if ( dto.getSxrq() != null ) {
            pcmYdbxmx.setSxrq( dto.getSxrq() );
        }
        if ( dto.getPimpersonid() != null ) {
            pcmYdbxmx.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getYzw() != null ) {
            pcmYdbxmx.setYzw( dto.getYzw() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmYdbxmx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getZz() != null ) {
            pcmYdbxmx.setZz( dto.getZz() );
        }
        if ( dto.getShortname() != null ) {
            pcmYdbxmx.setShortname( dto.getShortname() );
        }
        if ( dto.getPcmydbxmxid() != null ) {
            pcmYdbxmx.setPcmydbxmxid( dto.getPcmydbxmxid() );
        }
        if ( dto.getNl() != null ) {
            pcmYdbxmx.setNl( dto.getNl() );
        }
        if ( dto.getPimpersonname() != null ) {
            pcmYdbxmx.setPimpersonname( dto.getPimpersonname() );
        }

        return pcmYdbxmx;
    }

    @Override
    public PcmYdbxmxDTO toDto(PcmYdbxmx entity) {
        if ( entity == null ) {
            return null;
        }

        PcmYdbxmxDTO pcmYdbxmxDTO = new PcmYdbxmxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmYdbxmxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmYdbxmxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getBxyy() != null ) {
            pcmYdbxmxDTO.setBxyy( entity.getBxyy() );
        }
        if ( entity.getPcmydbxmxname() != null ) {
            pcmYdbxmxDTO.setPcmydbxmxname( entity.getPcmydbxmxname() );
        }
        if ( entity.getDistirbutionid() != null ) {
            pcmYdbxmxDTO.setDistirbutionid( entity.getDistirbutionid() );
        }
        if ( entity.getBz() != null ) {
            pcmYdbxmxDTO.setBz( entity.getBz() );
        }
        if ( entity.getCz() != null ) {
            pcmYdbxmxDTO.setCz( entity.getCz() );
        }
        if ( entity.getJsrq() != null ) {
            pcmYdbxmxDTO.setJsrq( entity.getJsrq() );
        }
        if ( entity.getIsfinished() != null ) {
            pcmYdbxmxDTO.setIsfinished( entity.getIsfinished() );
        }
        if ( entity.getZjhm() != null ) {
            pcmYdbxmxDTO.setZjhm( entity.getZjhm() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmYdbxmxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getYgbh() != null ) {
            pcmYdbxmxDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getYrank() != null ) {
            pcmYdbxmxDTO.setYrank( entity.getYrank() );
        }
        if ( entity.getZzid() != null ) {
            pcmYdbxmxDTO.setZzid( entity.getZzid() );
        }
        if ( entity.getYgw() != null ) {
            pcmYdbxmxDTO.setYgw( entity.getYgw() );
        }
        if ( entity.getOrgsectorid() != null ) {
            pcmYdbxmxDTO.setOrgsectorid( entity.getOrgsectorid() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmYdbxmxDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getLxdh() != null ) {
            pcmYdbxmxDTO.setLxdh( entity.getLxdh() );
        }
        if ( entity.getBmid() != null ) {
            pcmYdbxmxDTO.setBmid( entity.getBmid() );
        }
        if ( entity.getBm() != null ) {
            pcmYdbxmxDTO.setBm( entity.getBm() );
        }
        if ( entity.getCheckstatus() != null ) {
            pcmYdbxmxDTO.setCheckstatus( entity.getCheckstatus() );
        }
        if ( entity.getZzdzs() != null ) {
            pcmYdbxmxDTO.setZzdzs( entity.getZzdzs() );
        }
        if ( entity.getPcmydmxtype() != null ) {
            pcmYdbxmxDTO.setPcmydmxtype( entity.getPcmydmxtype() );
        }
        if ( entity.getCsrq() != null ) {
            pcmYdbxmxDTO.setCsrq( entity.getCsrq() );
        }
        if ( entity.getCreateman() != null ) {
            pcmYdbxmxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getOrgid() != null ) {
            pcmYdbxmxDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getSxrq() != null ) {
            pcmYdbxmxDTO.setSxrq( entity.getSxrq() );
        }
        if ( entity.getPimpersonid() != null ) {
            pcmYdbxmxDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getYzw() != null ) {
            pcmYdbxmxDTO.setYzw( entity.getYzw() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmYdbxmxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getZz() != null ) {
            pcmYdbxmxDTO.setZz( entity.getZz() );
        }
        if ( entity.getShortname() != null ) {
            pcmYdbxmxDTO.setShortname( entity.getShortname() );
        }
        if ( entity.getPcmydbxmxid() != null ) {
            pcmYdbxmxDTO.setPcmydbxmxid( entity.getPcmydbxmxid() );
        }
        if ( entity.getNl() != null ) {
            pcmYdbxmxDTO.setNl( entity.getNl() );
        }
        if ( entity.getPimpersonname() != null ) {
            pcmYdbxmxDTO.setPimpersonname( entity.getPimpersonname() );
        }

        return pcmYdbxmxDTO;
    }

    @Override
    public List<PcmYdbxmx> toDomain(List<PcmYdbxmxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmYdbxmx> list = new ArrayList<PcmYdbxmx>( dtoList.size() );
        for ( PcmYdbxmxDTO pcmYdbxmxDTO : dtoList ) {
            list.add( toDomain( pcmYdbxmxDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmYdbxmxDTO> toDto(List<PcmYdbxmx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmYdbxmxDTO> list = new ArrayList<PcmYdbxmxDTO>( entityList.size() );
        for ( PcmYdbxmx pcmYdbxmx : entityList ) {
            list.add( toDto( pcmYdbxmx ) );
        }

        return list;
    }
}
