package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmEducationExperience;
import cn.ibizlab.ehr.webapi.dto.PcmEducationExperienceDTO;
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
    date = "2021-09-04T00:31:45+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmEducationExperienceMappingImpl implements PcmEducationExperienceMapping {

    @Override
    public PcmEducationExperience toDomain(PcmEducationExperienceDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmEducationExperience pcmEducationExperience = new PcmEducationExperience();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmEducationExperience.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmEducationExperience.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getMajordescription() != null ) {
            pcmEducationExperience.setMajordescription( dto.getMajordescription() );
        }
        if ( dto.getFlag() != null ) {
            pcmEducationExperience.setFlag( dto.getFlag() );
        }
        if ( dto.getSubjectresearch() != null ) {
            pcmEducationExperience.setSubjectresearch( dto.getSubjectresearch() );
        }
        if ( dto.getTrainingmode() != null ) {
            pcmEducationExperience.setTrainingmode( dto.getTrainingmode() );
        }
        if ( dto.getMajorcategory() != null ) {
            pcmEducationExperience.setMajorcategory( dto.getMajorcategory() );
        }
        if ( dto.getPcmeducationexperiencename() != null ) {
            pcmEducationExperience.setPcmeducationexperiencename( dto.getPcmeducationexperiencename() );
        }
        if ( dto.getFormsoflearning() != null ) {
            pcmEducationExperience.setFormsoflearning( dto.getFormsoflearning() );
        }
        if ( dto.getEducationlevel() != null ) {
            pcmEducationExperience.setEducationlevel( dto.getEducationlevel() );
        }
        if ( dto.getXwz() != null ) {
            pcmEducationExperience.setXwz( dto.getXwz() );
        }
        if ( dto.getBbsj() != null ) {
            pcmEducationExperience.setBbsj( dto.getBbsj() );
        }
        if ( dto.getMajorcourses() != null ) {
            pcmEducationExperience.setMajorcourses( dto.getMajorcourses() );
        }
        if ( dto.getCollegename() != null ) {
            pcmEducationExperience.setCollegename( dto.getCollegename() );
        }
        if ( dto.getByz() != null ) {
            pcmEducationExperience.setByz( dto.getByz() );
        }
        if ( dto.getXlyz() != null ) {
            pcmEducationExperience.setXlyz( dto.getXlyz() );
        }
        if ( dto.getIsabroad() != null ) {
            pcmEducationExperience.setIsabroad( dto.getIsabroad() );
        }
        if ( dto.getStarttime() != null ) {
            pcmEducationExperience.setStarttime( dto.getStarttime() );
        }
        if ( dto.getSfxzy() != null ) {
            pcmEducationExperience.setSfxzy( dto.getSfxzy() );
        }
        if ( dto.getXkml() != null ) {
            pcmEducationExperience.setXkml( dto.getXkml() );
        }
        if ( dto.getHigestxl() != null ) {
            pcmEducationExperience.setHigestxl( dto.getHigestxl() );
        }
        if ( dto.getMajorname() != null ) {
            pcmEducationExperience.setMajorname( dto.getMajorname() );
        }
        if ( dto.getSchoolname() != null ) {
            pcmEducationExperience.setSchoolname( dto.getSchoolname() );
        }
        if ( dto.getCity() != null ) {
            pcmEducationExperience.setCity( dto.getCity() );
        }
        if ( dto.getXxxz() != null ) {
            pcmEducationExperience.setXxxz( dto.getXxxz() );
        }
        if ( dto.getXl() != null ) {
            pcmEducationExperience.setXl( dto.getXl() );
        }
        if ( dto.getEndtime() != null ) {
            pcmEducationExperience.setEndtime( dto.getEndtime() );
        }
        if ( dto.getDegree() != null ) {
            pcmEducationExperience.setDegree( dto.getDegree() );
        }
        if ( dto.getFirstxl() != null ) {
            pcmEducationExperience.setFirstxl( dto.getFirstxl() );
        }
        if ( dto.getPcmprofileid() != null ) {
            pcmEducationExperience.setPcmprofileid( dto.getPcmprofileid() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmEducationExperience.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmEducationExperience.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmEducationExperience.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            pcmEducationExperience.setCreateman( dto.getCreateman() );
        }
        if ( dto.getPcmeducationexperienceid() != null ) {
            pcmEducationExperience.setPcmeducationexperienceid( dto.getPcmeducationexperienceid() );
        }
        if ( dto.getCertificatenumber() != null ) {
            pcmEducationExperience.setCertificatenumber( dto.getCertificatenumber() );
        }
        if ( dto.getPcmprofilename() != null ) {
            pcmEducationExperience.setPcmprofilename( dto.getPcmprofilename() );
        }
        if ( dto.getXznf() != null ) {
            pcmEducationExperience.setXznf( dto.getXznf() );
        }

        return pcmEducationExperience;
    }

    @Override
    public PcmEducationExperienceDTO toDto(PcmEducationExperience entity) {
        if ( entity == null ) {
            return null;
        }

        PcmEducationExperienceDTO pcmEducationExperienceDTO = new PcmEducationExperienceDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmEducationExperienceDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmEducationExperienceDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getMajordescription() != null ) {
            pcmEducationExperienceDTO.setMajordescription( entity.getMajordescription() );
        }
        if ( entity.getFlag() != null ) {
            pcmEducationExperienceDTO.setFlag( entity.getFlag() );
        }
        if ( entity.getSubjectresearch() != null ) {
            pcmEducationExperienceDTO.setSubjectresearch( entity.getSubjectresearch() );
        }
        if ( entity.getTrainingmode() != null ) {
            pcmEducationExperienceDTO.setTrainingmode( entity.getTrainingmode() );
        }
        if ( entity.getMajorcategory() != null ) {
            pcmEducationExperienceDTO.setMajorcategory( entity.getMajorcategory() );
        }
        if ( entity.getPcmeducationexperiencename() != null ) {
            pcmEducationExperienceDTO.setPcmeducationexperiencename( entity.getPcmeducationexperiencename() );
        }
        if ( entity.getFormsoflearning() != null ) {
            pcmEducationExperienceDTO.setFormsoflearning( entity.getFormsoflearning() );
        }
        if ( entity.getEducationlevel() != null ) {
            pcmEducationExperienceDTO.setEducationlevel( entity.getEducationlevel() );
        }
        if ( entity.getXwz() != null ) {
            pcmEducationExperienceDTO.setXwz( entity.getXwz() );
        }
        if ( entity.getBbsj() != null ) {
            pcmEducationExperienceDTO.setBbsj( entity.getBbsj() );
        }
        if ( entity.getMajorcourses() != null ) {
            pcmEducationExperienceDTO.setMajorcourses( entity.getMajorcourses() );
        }
        if ( entity.getCollegename() != null ) {
            pcmEducationExperienceDTO.setCollegename( entity.getCollegename() );
        }
        if ( entity.getByz() != null ) {
            pcmEducationExperienceDTO.setByz( entity.getByz() );
        }
        if ( entity.getXlyz() != null ) {
            pcmEducationExperienceDTO.setXlyz( entity.getXlyz() );
        }
        if ( entity.getIsabroad() != null ) {
            pcmEducationExperienceDTO.setIsabroad( entity.getIsabroad() );
        }
        if ( entity.getStarttime() != null ) {
            pcmEducationExperienceDTO.setStarttime( entity.getStarttime() );
        }
        if ( entity.getSfxzy() != null ) {
            pcmEducationExperienceDTO.setSfxzy( entity.getSfxzy() );
        }
        if ( entity.getXkml() != null ) {
            pcmEducationExperienceDTO.setXkml( entity.getXkml() );
        }
        if ( entity.getHigestxl() != null ) {
            pcmEducationExperienceDTO.setHigestxl( entity.getHigestxl() );
        }
        if ( entity.getMajorname() != null ) {
            pcmEducationExperienceDTO.setMajorname( entity.getMajorname() );
        }
        if ( entity.getSchoolname() != null ) {
            pcmEducationExperienceDTO.setSchoolname( entity.getSchoolname() );
        }
        if ( entity.getCity() != null ) {
            pcmEducationExperienceDTO.setCity( entity.getCity() );
        }
        if ( entity.getXxxz() != null ) {
            pcmEducationExperienceDTO.setXxxz( entity.getXxxz() );
        }
        if ( entity.getXl() != null ) {
            pcmEducationExperienceDTO.setXl( entity.getXl() );
        }
        if ( entity.getEndtime() != null ) {
            pcmEducationExperienceDTO.setEndtime( entity.getEndtime() );
        }
        if ( entity.getDegree() != null ) {
            pcmEducationExperienceDTO.setDegree( entity.getDegree() );
        }
        if ( entity.getFirstxl() != null ) {
            pcmEducationExperienceDTO.setFirstxl( entity.getFirstxl() );
        }
        if ( entity.getPcmprofileid() != null ) {
            pcmEducationExperienceDTO.setPcmprofileid( entity.getPcmprofileid() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmEducationExperienceDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmEducationExperienceDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmEducationExperienceDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            pcmEducationExperienceDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getPcmeducationexperienceid() != null ) {
            pcmEducationExperienceDTO.setPcmeducationexperienceid( entity.getPcmeducationexperienceid() );
        }
        if ( entity.getCertificatenumber() != null ) {
            pcmEducationExperienceDTO.setCertificatenumber( entity.getCertificatenumber() );
        }
        if ( entity.getPcmprofilename() != null ) {
            pcmEducationExperienceDTO.setPcmprofilename( entity.getPcmprofilename() );
        }
        if ( entity.getXznf() != null ) {
            pcmEducationExperienceDTO.setXznf( entity.getXznf() );
        }

        return pcmEducationExperienceDTO;
    }

    @Override
    public List<PcmEducationExperience> toDomain(List<PcmEducationExperienceDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmEducationExperience> list = new ArrayList<PcmEducationExperience>( dtoList.size() );
        for ( PcmEducationExperienceDTO pcmEducationExperienceDTO : dtoList ) {
            list.add( toDomain( pcmEducationExperienceDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmEducationExperienceDTO> toDto(List<PcmEducationExperience> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmEducationExperienceDTO> list = new ArrayList<PcmEducationExperienceDTO>( entityList.size() );
        for ( PcmEducationExperience pcmEducationExperience : entityList ) {
            list.add( toDto( pcmEducationExperience ) );
        }

        return list;
    }
}
