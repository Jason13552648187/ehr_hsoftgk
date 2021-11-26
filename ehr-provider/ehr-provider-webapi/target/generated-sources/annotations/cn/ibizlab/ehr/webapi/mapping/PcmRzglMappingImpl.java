package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmRzgl;
import cn.ibizlab.ehr.webapi.dto.PcmRzglDTO;
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
    date = "2021-09-04T00:31:50+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmRzglMappingImpl implements PcmRzglMapping {

    @Override
    public PcmRzgl toDomain(PcmRzglDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmRzgl pcmRzgl = new PcmRzgl();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmRzgl.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmRzgl.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getRznxColor() != null ) {
            pcmRzgl.setRznxColor( dto.getRznxColor() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            pcmRzgl.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }
        if ( dto.getNldq() != null ) {
            pcmRzgl.setNldq( dto.getNldq() );
        }
        if ( dto.getZjnxColor() != null ) {
            pcmRzgl.setZjnxColor( dto.getZjnxColor() );
        }
        if ( dto.getZj() != null ) {
            pcmRzgl.setZj( dto.getZj() );
        }
        if ( dto.getDqzjxzw() != null ) {
            pcmRzgl.setDqzjxzw( dto.getDqzjxzw() );
        }
        if ( dto.getOrmorgname() != null ) {
            pcmRzgl.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getRznx() != null ) {
            pcmRzgl.setRznx( dto.getRznx() );
        }
        if ( dto.getZjnx() != null ) {
            pcmRzgl.setZjnx( dto.getZjnx() );
        }
        if ( dto.getPcmrzglname() != null ) {
            pcmRzgl.setPcmrzglname( dto.getPcmrzglname() );
        }
        if ( dto.getZwrq() != null ) {
            pcmRzgl.setZwrq( dto.getZwrq() );
        }
        if ( dto.getYgid() != null ) {
            pcmRzgl.setYgid( dto.getYgid() );
        }
        if ( dto.getYgname() != null ) {
            pcmRzgl.setYgname( dto.getYgname() );
        }
        if ( dto.getSex() != null ) {
            pcmRzgl.setSex( dto.getSex() );
        }
        if ( dto.getZjrq() != null ) {
            pcmRzgl.setZjrq( dto.getZjrq() );
        }
        if ( dto.getYgbh() != null ) {
            pcmRzgl.setYgbh( dto.getYgbh() );
        }
        if ( dto.getNl() != null ) {
            pcmRzgl.setNl( dto.getNl() );
        }
        if ( dto.getGw() != null ) {
            pcmRzgl.setGw( dto.getGw() );
        }
        if ( dto.getCreateman() != null ) {
            pcmRzgl.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmRzgl.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getOrgsectorid() != null ) {
            pcmRzgl.setOrgsectorid( dto.getOrgsectorid() );
        }
        if ( dto.getPcmrzglid() != null ) {
            pcmRzgl.setPcmrzglid( dto.getPcmrzglid() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmRzgl.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmRzgl.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getOrgid() != null ) {
            pcmRzgl.setOrgid( dto.getOrgid() );
        }

        return pcmRzgl;
    }

    @Override
    public PcmRzglDTO toDto(PcmRzgl entity) {
        if ( entity == null ) {
            return null;
        }

        PcmRzglDTO pcmRzglDTO = new PcmRzglDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmRzglDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmRzglDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getRznxColor() != null ) {
            pcmRzglDTO.setRznxColor( entity.getRznxColor() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            pcmRzglDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }
        if ( entity.getNldq() != null ) {
            pcmRzglDTO.setNldq( entity.getNldq() );
        }
        if ( entity.getZjnxColor() != null ) {
            pcmRzglDTO.setZjnxColor( entity.getZjnxColor() );
        }
        if ( entity.getZj() != null ) {
            pcmRzglDTO.setZj( entity.getZj() );
        }
        if ( entity.getDqzjxzw() != null ) {
            pcmRzglDTO.setDqzjxzw( entity.getDqzjxzw() );
        }
        if ( entity.getOrmorgname() != null ) {
            pcmRzglDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getRznx() != null ) {
            pcmRzglDTO.setRznx( entity.getRznx() );
        }
        if ( entity.getZjnx() != null ) {
            pcmRzglDTO.setZjnx( entity.getZjnx() );
        }
        if ( entity.getPcmrzglname() != null ) {
            pcmRzglDTO.setPcmrzglname( entity.getPcmrzglname() );
        }
        if ( entity.getZwrq() != null ) {
            pcmRzglDTO.setZwrq( entity.getZwrq() );
        }
        if ( entity.getYgid() != null ) {
            pcmRzglDTO.setYgid( entity.getYgid() );
        }
        if ( entity.getYgname() != null ) {
            pcmRzglDTO.setYgname( entity.getYgname() );
        }
        if ( entity.getSex() != null ) {
            pcmRzglDTO.setSex( entity.getSex() );
        }
        if ( entity.getZjrq() != null ) {
            pcmRzglDTO.setZjrq( entity.getZjrq() );
        }
        if ( entity.getYgbh() != null ) {
            pcmRzglDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getNl() != null ) {
            pcmRzglDTO.setNl( entity.getNl() );
        }
        if ( entity.getGw() != null ) {
            pcmRzglDTO.setGw( entity.getGw() );
        }
        if ( entity.getCreateman() != null ) {
            pcmRzglDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmRzglDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getOrgsectorid() != null ) {
            pcmRzglDTO.setOrgsectorid( entity.getOrgsectorid() );
        }
        if ( entity.getPcmrzglid() != null ) {
            pcmRzglDTO.setPcmrzglid( entity.getPcmrzglid() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmRzglDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmRzglDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getOrgid() != null ) {
            pcmRzglDTO.setOrgid( entity.getOrgid() );
        }

        return pcmRzglDTO;
    }

    @Override
    public List<PcmRzgl> toDomain(List<PcmRzglDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmRzgl> list = new ArrayList<PcmRzgl>( dtoList.size() );
        for ( PcmRzglDTO pcmRzglDTO : dtoList ) {
            list.add( toDomain( pcmRzglDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmRzglDTO> toDto(List<PcmRzgl> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmRzglDTO> list = new ArrayList<PcmRzglDTO>( entityList.size() );
        for ( PcmRzgl pcmRzgl : entityList ) {
            list.add( toDto( pcmRzgl ) );
        }

        return list;
    }
}
