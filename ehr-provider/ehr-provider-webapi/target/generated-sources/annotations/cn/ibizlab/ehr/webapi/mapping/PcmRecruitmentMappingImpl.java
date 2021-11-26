package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmRecruitment;
import cn.ibizlab.ehr.webapi.dto.PcmRecruitmentDTO;
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
public class PcmRecruitmentMappingImpl implements PcmRecruitmentMapping {

    @Override
    public PcmRecruitment toDomain(PcmRecruitmentDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmRecruitment pcmRecruitment = new PcmRecruitment();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmRecruitment.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmRecruitment.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getRequirements() != null ) {
            pcmRecruitment.setRequirements( dto.getRequirements() );
        }
        if ( dto.getSjzprs() != null ) {
            pcmRecruitment.setSjzprs( dto.getSjzprs() );
        }
        if ( dto.getPcmrecruitmentname() != null ) {
            pcmRecruitment.setPcmrecruitmentname( dto.getPcmrecruitmentname() );
        }
        if ( dto.getYjzprs() != null ) {
            pcmRecruitment.setYjzprs( dto.getYjzprs() );
        }
        if ( dto.getSfzpwc() != null ) {
            pcmRecruitment.setSfzpwc( dto.getSfzpwc() );
        }
        if ( dto.getRecruitmenttype() != null ) {
            pcmRecruitment.setRecruitmenttype( dto.getRecruitmenttype() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            pcmRecruitment.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getOrmorgid() != null ) {
            pcmRecruitment.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getOrmpostid() != null ) {
            pcmRecruitment.setOrmpostid( dto.getOrmpostid() );
        }
        if ( dto.getOrmdutyid() != null ) {
            pcmRecruitment.setOrmdutyid( dto.getOrmdutyid() );
        }
        if ( dto.getCreateman() != null ) {
            pcmRecruitment.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmRecruitment.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmRecruitment.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmRecruitment.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getPcmrecruitmentid() != null ) {
            pcmRecruitment.setPcmrecruitmentid( dto.getPcmrecruitmentid() );
        }
        if ( dto.getOrmpostname() != null ) {
            pcmRecruitment.setOrmpostname( dto.getOrmpostname() );
        }
        if ( dto.getOrmorgname() != null ) {
            pcmRecruitment.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            pcmRecruitment.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }
        if ( dto.getOrmdutyname() != null ) {
            pcmRecruitment.setOrmdutyname( dto.getOrmdutyname() );
        }

        return pcmRecruitment;
    }

    @Override
    public PcmRecruitmentDTO toDto(PcmRecruitment entity) {
        if ( entity == null ) {
            return null;
        }

        PcmRecruitmentDTO pcmRecruitmentDTO = new PcmRecruitmentDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmRecruitmentDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmRecruitmentDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getRequirements() != null ) {
            pcmRecruitmentDTO.setRequirements( entity.getRequirements() );
        }
        if ( entity.getSjzprs() != null ) {
            pcmRecruitmentDTO.setSjzprs( entity.getSjzprs() );
        }
        if ( entity.getPcmrecruitmentname() != null ) {
            pcmRecruitmentDTO.setPcmrecruitmentname( entity.getPcmrecruitmentname() );
        }
        if ( entity.getYjzprs() != null ) {
            pcmRecruitmentDTO.setYjzprs( entity.getYjzprs() );
        }
        if ( entity.getSfzpwc() != null ) {
            pcmRecruitmentDTO.setSfzpwc( entity.getSfzpwc() );
        }
        if ( entity.getRecruitmenttype() != null ) {
            pcmRecruitmentDTO.setRecruitmenttype( entity.getRecruitmenttype() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            pcmRecruitmentDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getOrmorgid() != null ) {
            pcmRecruitmentDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getOrmpostid() != null ) {
            pcmRecruitmentDTO.setOrmpostid( entity.getOrmpostid() );
        }
        if ( entity.getOrmdutyid() != null ) {
            pcmRecruitmentDTO.setOrmdutyid( entity.getOrmdutyid() );
        }
        if ( entity.getCreateman() != null ) {
            pcmRecruitmentDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmRecruitmentDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmRecruitmentDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmRecruitmentDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getPcmrecruitmentid() != null ) {
            pcmRecruitmentDTO.setPcmrecruitmentid( entity.getPcmrecruitmentid() );
        }
        if ( entity.getOrmpostname() != null ) {
            pcmRecruitmentDTO.setOrmpostname( entity.getOrmpostname() );
        }
        if ( entity.getOrmorgname() != null ) {
            pcmRecruitmentDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            pcmRecruitmentDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }
        if ( entity.getOrmdutyname() != null ) {
            pcmRecruitmentDTO.setOrmdutyname( entity.getOrmdutyname() );
        }

        return pcmRecruitmentDTO;
    }

    @Override
    public List<PcmRecruitment> toDomain(List<PcmRecruitmentDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmRecruitment> list = new ArrayList<PcmRecruitment>( dtoList.size() );
        for ( PcmRecruitmentDTO pcmRecruitmentDTO : dtoList ) {
            list.add( toDomain( pcmRecruitmentDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmRecruitmentDTO> toDto(List<PcmRecruitment> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmRecruitmentDTO> list = new ArrayList<PcmRecruitmentDTO>( entityList.size() );
        for ( PcmRecruitment pcmRecruitment : entityList ) {
            list.add( toDto( pcmRecruitment ) );
        }

        return list;
    }
}
