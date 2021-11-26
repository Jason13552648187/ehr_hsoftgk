package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmJxsbdjl;
import cn.ibizlab.ehr.webapi.dto.PcmJxsbdjlDTO;
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
    date = "2021-09-04T00:31:53+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmJxsbdjlMappingImpl implements PcmJxsbdjlMapping {

    @Override
    public PcmJxsbdjl toDomain(PcmJxsbdjlDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmJxsbdjl pcmJxsbdjl = new PcmJxsbdjl();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmJxsbdjl.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmJxsbdjl.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getPcmjxsbdjlname() != null ) {
            pcmJxsbdjl.setPcmjxsbdjlname( dto.getPcmjxsbdjlname() );
        }
        if ( dto.getBdsjsj() != null ) {
            pcmJxsbdjl.setBdsjsj( dto.getBdsjsj() );
        }
        if ( dto.getBdqssj() != null ) {
            pcmJxsbdjl.setBdqssj( dto.getBdqssj() );
        }
        if ( dto.getBdqksm() != null ) {
            pcmJxsbdjl.setBdqksm( dto.getBdqksm() );
        }
        if ( dto.getPimpersonid() != null ) {
            pcmJxsbdjl.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getOrmpostid() != null ) {
            pcmJxsbdjl.setOrmpostid( dto.getOrmpostid() );
        }
        if ( dto.getOrmorgid() != null ) {
            pcmJxsbdjl.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            pcmJxsbdjl.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmJxsbdjl.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmJxsbdjl.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getPcmjxsbdjlid() != null ) {
            pcmJxsbdjl.setPcmjxsbdjlid( dto.getPcmjxsbdjlid() );
        }
        if ( dto.getCreateman() != null ) {
            pcmJxsbdjl.setCreateman( dto.getCreateman() );
        }
        if ( dto.getOrgid() != null ) {
            pcmJxsbdjl.setOrgid( dto.getOrgid() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmJxsbdjl.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getOrgsectorid() != null ) {
            pcmJxsbdjl.setOrgsectorid( dto.getOrgsectorid() );
        }
        if ( dto.getYbm() != null ) {
            pcmJxsbdjl.setYbm( dto.getYbm() );
        }
        if ( dto.getYgw() != null ) {
            pcmJxsbdjl.setYgw( dto.getYgw() );
        }
        if ( dto.getOrmorgname() != null ) {
            pcmJxsbdjl.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getYgbh() != null ) {
            pcmJxsbdjl.setYgbh( dto.getYgbh() );
        }
        if ( dto.getPimpersonname() != null ) {
            pcmJxsbdjl.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getOrmpostname() != null ) {
            pcmJxsbdjl.setOrmpostname( dto.getOrmpostname() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            pcmJxsbdjl.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }
        if ( dto.getYzz() != null ) {
            pcmJxsbdjl.setYzz( dto.getYzz() );
        }

        return pcmJxsbdjl;
    }

    @Override
    public PcmJxsbdjlDTO toDto(PcmJxsbdjl entity) {
        if ( entity == null ) {
            return null;
        }

        PcmJxsbdjlDTO pcmJxsbdjlDTO = new PcmJxsbdjlDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmJxsbdjlDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmJxsbdjlDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getPcmjxsbdjlname() != null ) {
            pcmJxsbdjlDTO.setPcmjxsbdjlname( entity.getPcmjxsbdjlname() );
        }
        if ( entity.getBdsjsj() != null ) {
            pcmJxsbdjlDTO.setBdsjsj( entity.getBdsjsj() );
        }
        if ( entity.getBdqssj() != null ) {
            pcmJxsbdjlDTO.setBdqssj( entity.getBdqssj() );
        }
        if ( entity.getBdqksm() != null ) {
            pcmJxsbdjlDTO.setBdqksm( entity.getBdqksm() );
        }
        if ( entity.getPimpersonid() != null ) {
            pcmJxsbdjlDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getOrmpostid() != null ) {
            pcmJxsbdjlDTO.setOrmpostid( entity.getOrmpostid() );
        }
        if ( entity.getOrmorgid() != null ) {
            pcmJxsbdjlDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            pcmJxsbdjlDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmJxsbdjlDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmJxsbdjlDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getPcmjxsbdjlid() != null ) {
            pcmJxsbdjlDTO.setPcmjxsbdjlid( entity.getPcmjxsbdjlid() );
        }
        if ( entity.getCreateman() != null ) {
            pcmJxsbdjlDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getOrgid() != null ) {
            pcmJxsbdjlDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmJxsbdjlDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getOrgsectorid() != null ) {
            pcmJxsbdjlDTO.setOrgsectorid( entity.getOrgsectorid() );
        }
        if ( entity.getYbm() != null ) {
            pcmJxsbdjlDTO.setYbm( entity.getYbm() );
        }
        if ( entity.getYgw() != null ) {
            pcmJxsbdjlDTO.setYgw( entity.getYgw() );
        }
        if ( entity.getOrmorgname() != null ) {
            pcmJxsbdjlDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getYgbh() != null ) {
            pcmJxsbdjlDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getPimpersonname() != null ) {
            pcmJxsbdjlDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getOrmpostname() != null ) {
            pcmJxsbdjlDTO.setOrmpostname( entity.getOrmpostname() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            pcmJxsbdjlDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }
        if ( entity.getYzz() != null ) {
            pcmJxsbdjlDTO.setYzz( entity.getYzz() );
        }

        return pcmJxsbdjlDTO;
    }

    @Override
    public List<PcmJxsbdjl> toDomain(List<PcmJxsbdjlDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmJxsbdjl> list = new ArrayList<PcmJxsbdjl>( dtoList.size() );
        for ( PcmJxsbdjlDTO pcmJxsbdjlDTO : dtoList ) {
            list.add( toDomain( pcmJxsbdjlDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmJxsbdjlDTO> toDto(List<PcmJxsbdjl> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmJxsbdjlDTO> list = new ArrayList<PcmJxsbdjlDTO>( entityList.size() );
        for ( PcmJxsbdjl pcmJxsbdjl : entityList ) {
            list.add( toDto( pcmJxsbdjl ) );
        }

        return list;
    }
}
