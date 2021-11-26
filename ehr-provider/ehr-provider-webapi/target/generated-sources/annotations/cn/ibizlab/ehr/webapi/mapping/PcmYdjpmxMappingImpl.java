package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmYdjpmx;
import cn.ibizlab.ehr.webapi.dto.PcmYdjpmxDTO;
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
    date = "2021-09-04T00:31:51+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmYdjpmxMappingImpl implements PcmYdjpmxMapping {

    @Override
    public PcmYdjpmx toDomain(PcmYdjpmxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmYdjpmx pcmYdjpmx = new PcmYdjpmx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmYdjpmx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmYdjpmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getJsrq() != null ) {
            pcmYdjpmx.setJsrq( dto.getJsrq() );
        }
        if ( dto.getSfhmd() != null ) {
            pcmYdjpmx.setSfhmd( dto.getSfhmd() );
        }
        if ( dto.getSfldzy() != null ) {
            pcmYdjpmx.setSfldzy( dto.getSfldzy() );
        }
        if ( dto.getRemarks() != null ) {
            pcmYdjpmx.setRemarks( dto.getRemarks() );
        }
        if ( dto.getBcjse() != null ) {
            pcmYdjpmx.setBcjse( dto.getBcjse() );
        }
        if ( dto.getLdzytype() != null ) {
            pcmYdjpmx.setLdzytype( dto.getLdzytype() );
        }
        if ( dto.getPcjse() != null ) {
            pcmYdjpmx.setPcjse( dto.getPcjse() );
        }
        if ( dto.getPcmydjpmxname() != null ) {
            pcmYdjpmx.setPcmydjpmxname( dto.getPcmydjpmxname() );
        }
        if ( dto.getReason() != null ) {
            pcmYdjpmx.setReason( dto.getReason() );
        }
        if ( dto.getJpfj() != null ) {
            pcmYdjpmx.setJpfj( dto.getJpfj() );
        }
        if ( dto.getBz() != null ) {
            pcmYdjpmx.setBz( dto.getBz() );
        }
        if ( dto.getCz() != null ) {
            pcmYdjpmx.setCz( dto.getCz() );
        }
        if ( dto.getSfzfbcj() != null ) {
            pcmYdjpmx.setSfzfbcj( dto.getSfzfbcj() );
        }
        if ( dto.getIsfinished() != null ) {
            pcmYdjpmx.setIsfinished( dto.getIsfinished() );
        }
        if ( dto.getPcmydmxtype() != null ) {
            pcmYdjpmx.setPcmydmxtype( dto.getPcmydmxtype() );
        }
        if ( dto.getBmid() != null ) {
            pcmYdjpmx.setBmid( dto.getBmid() );
        }
        if ( dto.getYgw() != null ) {
            pcmYdjpmx.setYgw( dto.getYgw() );
        }
        if ( dto.getZzid() != null ) {
            pcmYdjpmx.setZzid( dto.getZzid() );
        }
        if ( dto.getPimpersonid() != null ) {
            pcmYdjpmx.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getNl() != null ) {
            pcmYdjpmx.setNl( dto.getNl() );
        }
        if ( dto.getCreateman() != null ) {
            pcmYdjpmx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getPcmydjpmxid() != null ) {
            pcmYdjpmx.setPcmydjpmxid( dto.getPcmydjpmxid() );
        }
        if ( dto.getYgbh() != null ) {
            pcmYdjpmx.setYgbh( dto.getYgbh() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmYdjpmx.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getShortname() != null ) {
            pcmYdjpmx.setShortname( dto.getShortname() );
        }
        if ( dto.getPimpersonname() != null ) {
            pcmYdjpmx.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getOrgsectorid() != null ) {
            pcmYdjpmx.setOrgsectorid( dto.getOrgsectorid() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmYdjpmx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmYdjpmx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getBm() != null ) {
            pcmYdjpmx.setBm( dto.getBm() );
        }
        if ( dto.getZz() != null ) {
            pcmYdjpmx.setZz( dto.getZz() );
        }
        if ( dto.getSxrq() != null ) {
            pcmYdjpmx.setSxrq( dto.getSxrq() );
        }
        if ( dto.getCheckstatus() != null ) {
            pcmYdjpmx.setCheckstatus( dto.getCheckstatus() );
        }
        if ( dto.getOrgid() != null ) {
            pcmYdjpmx.setOrgid( dto.getOrgid() );
        }
        if ( dto.getLxdh() != null ) {
            pcmYdjpmx.setLxdh( dto.getLxdh() );
        }
        if ( dto.getZzdzs() != null ) {
            pcmYdjpmx.setZzdzs( dto.getZzdzs() );
        }
        if ( dto.getYrank() != null ) {
            pcmYdjpmx.setYrank( dto.getYrank() );
        }
        if ( dto.getZjhm() != null ) {
            pcmYdjpmx.setZjhm( dto.getZjhm() );
        }
        if ( dto.getCsrq() != null ) {
            pcmYdjpmx.setCsrq( dto.getCsrq() );
        }
        if ( dto.getYzw() != null ) {
            pcmYdjpmx.setYzw( dto.getYzw() );
        }

        return pcmYdjpmx;
    }

    @Override
    public PcmYdjpmxDTO toDto(PcmYdjpmx entity) {
        if ( entity == null ) {
            return null;
        }

        PcmYdjpmxDTO pcmYdjpmxDTO = new PcmYdjpmxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmYdjpmxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmYdjpmxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getJsrq() != null ) {
            pcmYdjpmxDTO.setJsrq( entity.getJsrq() );
        }
        if ( entity.getSfhmd() != null ) {
            pcmYdjpmxDTO.setSfhmd( entity.getSfhmd() );
        }
        if ( entity.getSfldzy() != null ) {
            pcmYdjpmxDTO.setSfldzy( entity.getSfldzy() );
        }
        if ( entity.getRemarks() != null ) {
            pcmYdjpmxDTO.setRemarks( entity.getRemarks() );
        }
        if ( entity.getBcjse() != null ) {
            pcmYdjpmxDTO.setBcjse( entity.getBcjse() );
        }
        if ( entity.getLdzytype() != null ) {
            pcmYdjpmxDTO.setLdzytype( entity.getLdzytype() );
        }
        if ( entity.getPcjse() != null ) {
            pcmYdjpmxDTO.setPcjse( entity.getPcjse() );
        }
        if ( entity.getPcmydjpmxname() != null ) {
            pcmYdjpmxDTO.setPcmydjpmxname( entity.getPcmydjpmxname() );
        }
        if ( entity.getReason() != null ) {
            pcmYdjpmxDTO.setReason( entity.getReason() );
        }
        if ( entity.getJpfj() != null ) {
            pcmYdjpmxDTO.setJpfj( entity.getJpfj() );
        }
        if ( entity.getBz() != null ) {
            pcmYdjpmxDTO.setBz( entity.getBz() );
        }
        if ( entity.getCz() != null ) {
            pcmYdjpmxDTO.setCz( entity.getCz() );
        }
        if ( entity.getSfzfbcj() != null ) {
            pcmYdjpmxDTO.setSfzfbcj( entity.getSfzfbcj() );
        }
        if ( entity.getIsfinished() != null ) {
            pcmYdjpmxDTO.setIsfinished( entity.getIsfinished() );
        }
        if ( entity.getPcmydmxtype() != null ) {
            pcmYdjpmxDTO.setPcmydmxtype( entity.getPcmydmxtype() );
        }
        if ( entity.getBmid() != null ) {
            pcmYdjpmxDTO.setBmid( entity.getBmid() );
        }
        if ( entity.getYgw() != null ) {
            pcmYdjpmxDTO.setYgw( entity.getYgw() );
        }
        if ( entity.getZzid() != null ) {
            pcmYdjpmxDTO.setZzid( entity.getZzid() );
        }
        if ( entity.getPimpersonid() != null ) {
            pcmYdjpmxDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getNl() != null ) {
            pcmYdjpmxDTO.setNl( entity.getNl() );
        }
        if ( entity.getCreateman() != null ) {
            pcmYdjpmxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getPcmydjpmxid() != null ) {
            pcmYdjpmxDTO.setPcmydjpmxid( entity.getPcmydjpmxid() );
        }
        if ( entity.getYgbh() != null ) {
            pcmYdjpmxDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmYdjpmxDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getShortname() != null ) {
            pcmYdjpmxDTO.setShortname( entity.getShortname() );
        }
        if ( entity.getPimpersonname() != null ) {
            pcmYdjpmxDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getOrgsectorid() != null ) {
            pcmYdjpmxDTO.setOrgsectorid( entity.getOrgsectorid() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmYdjpmxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmYdjpmxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getBm() != null ) {
            pcmYdjpmxDTO.setBm( entity.getBm() );
        }
        if ( entity.getZz() != null ) {
            pcmYdjpmxDTO.setZz( entity.getZz() );
        }
        if ( entity.getSxrq() != null ) {
            pcmYdjpmxDTO.setSxrq( entity.getSxrq() );
        }
        if ( entity.getCheckstatus() != null ) {
            pcmYdjpmxDTO.setCheckstatus( entity.getCheckstatus() );
        }
        if ( entity.getOrgid() != null ) {
            pcmYdjpmxDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getLxdh() != null ) {
            pcmYdjpmxDTO.setLxdh( entity.getLxdh() );
        }
        if ( entity.getZzdzs() != null ) {
            pcmYdjpmxDTO.setZzdzs( entity.getZzdzs() );
        }
        if ( entity.getYrank() != null ) {
            pcmYdjpmxDTO.setYrank( entity.getYrank() );
        }
        if ( entity.getZjhm() != null ) {
            pcmYdjpmxDTO.setZjhm( entity.getZjhm() );
        }
        if ( entity.getCsrq() != null ) {
            pcmYdjpmxDTO.setCsrq( entity.getCsrq() );
        }
        if ( entity.getYzw() != null ) {
            pcmYdjpmxDTO.setYzw( entity.getYzw() );
        }

        return pcmYdjpmxDTO;
    }

    @Override
    public List<PcmYdjpmx> toDomain(List<PcmYdjpmxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmYdjpmx> list = new ArrayList<PcmYdjpmx>( dtoList.size() );
        for ( PcmYdjpmxDTO pcmYdjpmxDTO : dtoList ) {
            list.add( toDomain( pcmYdjpmxDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmYdjpmxDTO> toDto(List<PcmYdjpmx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmYdjpmxDTO> list = new ArrayList<PcmYdjpmxDTO>( entityList.size() );
        for ( PcmYdjpmx pcmYdjpmx : entityList ) {
            list.add( toDto( pcmYdjpmx ) );
        }

        return list;
    }
}
